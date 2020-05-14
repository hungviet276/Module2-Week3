public class Product {
    private String nameProduct ="";
    private int id;
    private double priceOfProduct;

    public Product(String nameProduct, int id, double priceOfProduct) {
        this.nameProduct = nameProduct;
        this.id = id;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
    public String toString(){
        return "ID: "+id+" Name: "+nameProduct +" price: "+priceOfProduct;
    }

}
