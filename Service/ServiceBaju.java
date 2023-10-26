package Service;

public interface ServiceBaju {
    public void ShowBaju();
    public void addBaju(String brand, String model, String size, String color, Integer price, Integer stock);
    public void sellBaju(int id,int Total);
    public void removeBaju(int id);
    
}
