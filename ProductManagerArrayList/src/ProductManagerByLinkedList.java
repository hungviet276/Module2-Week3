import java.util.Collections;
import java.util.LinkedList;

public class ProductManagerByLinkedList {
    LinkedList<Product> productLinkedList = new LinkedList();
    public void addProduct(Product product){
        productLinkedList.add(product);
    }
    public void editProduct(int id,String name,double price){
        for (Product product:productLinkedList
             ) {if (product.getId()==id){
                 product.setNameProduct(name);
                 product.setPriceOfProduct(price);
        }

        }
    }
    public void delProduct(int id){
        for (int i= 0; i< productLinkedList.size();i++){
            if (productLinkedList.get(i).getId()==id){
               productLinkedList.remove(i);
            }
        }
    }
    public void dislayListProduct(){
        for (Product product:productLinkedList
        ) {
            System.out.println(product.toString());

        }
    }
    public void searchByName(String name){
        String result="";
        for (int i = 0; i < productLinkedList.size();i++){
            if (productLinkedList.get(i).getNameProduct().equals(name)){
                result = productLinkedList.get(i).toString();
                break;
            } else result = "No product";
        }
        System.out.println(result);
    }
    public void sortByPriceIncrease(){
        SortProductByPriceIncrease up = new SortProductByPriceIncrease();
        Collections.sort(productLinkedList,up);
    }
    public void sortByPriceDown(){
        SortProductByPriceDown down = new SortProductByPriceDown();
        Collections.sort(productLinkedList,down);
    }
}
