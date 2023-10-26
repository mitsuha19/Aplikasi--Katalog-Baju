package View;

import Service.ServiceBaju;
import Util.InputUtil;

public class MyClothView {
    private ServiceBaju serviceBaju;

    public MyClothView (ServiceBaju serviceBaju) {
        this.serviceBaju = serviceBaju;
    }

    public void ShowMyCloth() {
        while(true) {
            serviceBaju.ShowBaju();
            System.out.println("Menu :");
            System.out.println("1. Tambah Katalog");
            System.out.println("2. Baju Dijual");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");
            System.out.println();

            var stop = false;

            switch (input) {
               case "1" -> addMyCloth();
               case "2" -> sellMyClotch();
               case "x" -> stop = true;
            }

            if (stop) {
                break;
            }

            System.out.println();
        }
    }

    public void addMyCloth() {
        System.out.println("Menambah Katalog Baju");

        var brand = InputUtil.input("Brand (x Jika Batal)");
        if (brand.equals("x")) {
            System.out.println("Tindakan dibatalkan");
            System.out.println();
        } else {
            var model = InputUtil.input("Model");
            var ukuran = InputUtil.input("Ukuran");
            var warna = InputUtil.input("Warna");
            var harga = InputUtil.input("Harga ($)");
            var stok = InputUtil.input("Stok Tersedia");
            System.out.println();
            serviceBaju.addBaju(brand, model, ukuran, warna, Integer.valueOf(harga), Integer.valueOf(stok));
        }
    }

    public void sellMyClotch() {
        System.out.println("Baju Dijual");
        var id = InputUtil.input("ID (x Jika Batal)");
        if(id.equals("x")) {
            System.out.println("Tindakan dibatalkan");
        }
        var total = InputUtil.input("Total Baju");
        serviceBaju.sellBaju(Integer.valueOf(id), Integer.valueOf(total));
    }
}
