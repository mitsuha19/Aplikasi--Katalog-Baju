package Service;

import java.util.ArrayList;

import Entity.ClothingCatalogue_036;
import Repository.RepositoryBaju;
public class ServiceBajuImpl implements ServiceBaju {

    private RepositoryBaju repositoryBaju;
    private int Pemasukan = 0;

    public ServiceBajuImpl(RepositoryBaju repositoryBaju) {
        this.repositoryBaju = repositoryBaju;
    }

    public void ShowBaju(){
        ArrayList<ClothingCatalogue_036> model = repositoryBaju.getAll();

        System.out.println("Total Pemasukan : $" + Pemasukan);
        System.out.println("Daftar Katalog Baju :");
        if(model.size() > 0) {
            for (int i = 0; i < model.size(); i++) {
                var myCloth = model.get(i);
                int No = i + 1;
                if (myCloth != null) {
                    System.out.println(No + ". " + myCloth.getBrand() + " (" + myCloth.getModel() + " | " + myCloth.getColor() + " | " + myCloth.getSize() + " | $" + myCloth.getPrice() + "/item)" + " [" + myCloth.getStock() + " tersedia]");
                }
            }
        } else {
            System.out.println(" - Belum ada daftar katalog baju yang tersedia");
        }

        System.out.println();
    }

    public void addBaju(String brand, String model, String size, String color, Integer price, Integer stock){

        ClothingCatalogue_036 test = null;
        for (ClothingCatalogue_036 baju : repositoryBaju.getAll()) {
            if (baju.getBrand().equals(brand) && baju.getColor().equals(color) && baju.getModel().equals(model) && baju.getSize().equals(size)){
            test = baju;
            }
        }

        ClothingCatalogue_036 bajugua = new ClothingCatalogue_036(model, brand, size, color, price, stock);
        if (test != null) {
            System.out.println("GAGAL MENAMBAH KATALOG BAJU :  data telah tersedia" );
        } else {
            System.out.println("SUKSES MENAMBAH KATALOG BAJU :  " + bajugua.getBrand() + " (" + bajugua.getModel() + " | " + bajugua.getColor() + " | " + bajugua.getSize() + ")");
            ClothingCatalogue_036 clothingCatalogue_036 = new ClothingCatalogue_036(model, brand, size, color, price, stock);
            repositoryBaju.add(clothingCatalogue_036);
        }
        
    }

    @Override 
    public void sellBaju(int id, int Total) {
        ArrayList<ClothingCatalogue_036> katalog = repositoryBaju.getAll();

        if(id >= 1 && id <= katalog.size()) {
            ClothingCatalogue_036 baju = katalog.get(id - 1);

            if(baju.getStock() >= Total) {
                int newStok = baju.getStock() - Total;
                baju.setStock(newStok);
                int totalharga = Total * baju.getPrice();
                Pemasukan += totalharga;
                System.out.println("BERHASIL MENJUAL BAJU :  " + baju.getBrand() + " (" + baju.getModel() + " | " + baju.getColor() + " | " + baju.getSize() + ")" + " sebanyak " + Total + " dengan total harga " + totalharga);

                if (newStok == 0) {
                    removeBaju(id);
                }
            }  else {
                System.out.println("GAGAL MENJUAL BAJU :  " + baju.getBrand() + " (" + baju.getModel() + " | " + baju.getColor() + " | " + baju.getSize() + ")" + " sebanyak " + Total + " dengan total harga " + Total * baju.getPrice());
            }
        } else {
            System.out.println("KATALOG BAJU dengan ID :  " + id + " tidak tersedia");
        }
    }

    @Override
    public void removeBaju(int id) {
        ArrayList<ClothingCatalogue_036> katalog = repositoryBaju.getAll();

        if(id >= 1 && id <= katalog.size()) {
            katalog.remove(id - 1);
        }
    }
    
}
