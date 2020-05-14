import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ProductManagerByArrayList {
    ArrayList<Product> productArrayList = new ArrayList<>();
//    public void addProduct(String nameProduct, int id, double priceOfProduct){
//        productArrayList.add(new Product(nameProduct,id,priceOfProduct));
//    }
    public void addProduct(Product product){
        productArrayList.add(product);
    }
    public void editProduct(int id,String newName, double newPrice){
        for (Product product: productArrayList
             ) {
            if (product.getId()== id){
                product.setNameProduct(newName);
                product.setPriceOfProduct(newPrice);
            }

        }
    }
    public void delProduct(int id){
       for (int i= 0; i< productArrayList.size();i++){
           if (productArrayList.get(i).getId()==id){
               productArrayList.remove(i);
           }
       }
    }
    public void dislayListProduct(){
        for (Product product:productArrayList
             ) {
            System.out.println(product.toString());

        }
    }
    public void searchByName(String name){
        String result="";
        for (int i = 0; i < productArrayList.size();i++){
            if (productArrayList.get(i).getNameProduct().equals(name)){
                result = productArrayList.get(i).toString();
                break;
            } else result = "No product";
        }
        System.out.println(result);
    }
    public void sortByPriceIncrease(){
        SortProductByPriceIncrease up = new SortProductByPriceIncrease();
        Collections.sort(productArrayList,up);
    }
    public void sortByPriceDown(){
        SortProductByPriceDown down = new SortProductByPriceDown();
        Collections.sort(productArrayList,down);
    }

}
