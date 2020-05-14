public class main {
    public static void main(String[] args) {
        Product product1 = new Product("Hung",1,100000);
        Product product2 = new Product("Phu",2,300000);
        Product product3 = new Product("Vu",3,500000);
        Product product4 = new Product("Lien",4,200000);
        Product product5 = new Product("Son",5,400000);

        ProductManagerByArrayList productManager = new ProductManagerByArrayList();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.addProduct(product5);


        //Sua thong tin san pham
        productManager.editProduct(5,"Dat",600000);
//        productManager.dislayListProduct();
        //Xoa san pham
        productManager.delProduct(5);
//        productManager.dislayListProduct();
        //Tim kiem san pham
        productManager.searchByName("Hung");
        //Sap xep theo gia tang dan
        productManager.sortByPriceIncrease();

        //Sap xep theo gia giam dan
        productManager.sortByPriceDown();

    }
}
