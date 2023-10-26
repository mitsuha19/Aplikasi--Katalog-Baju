package Entity;

public class ClothingCatalogue_036 {
    private int id;
    private String model;
    private String brand;
    private String size;
    private String color;
    private Integer price;
    private Integer stock;
    private static int totalInstance;

    public ClothingCatalogue_036(String model, String brand, String size, String color, Integer price, Integer stock) {
        ClothingCatalogue_036.totalInstance += 1;
        this.id = ClothingCatalogue_036.totalInstance;
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }
    
        public int getId() {
        return id;
        }

        public String getModel() {
        return model;
        }

        public void setModel(String model) {
        this.model = model;
        }

        public String getBrand() {
        return brand;
        }

        public void setBrand(String brand) {
        this.brand = brand;
        }

        public String getSize() {
        return size;
        }

        public void setSize(String size) {
        this.size = size;
        }

        public String getColor() {
        return color;
        }

        public void setColor(String color) {
        this.color = color;
        }

        public Integer getPrice() {
        return price;
        }

        public void setPrice(Integer price) {
        this.price = price;
        }

        public Integer getStock() {
        return stock;
        }

        public void setStock(Integer stock) {
        this.stock = stock;
        }

}