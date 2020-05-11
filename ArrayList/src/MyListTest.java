public class MyListTest {
    public static void main(String[] args) {
        MyList<String> elements = new MyList<String>();
        elements.add(0,"haha");
        elements.add(1,"hihi");
        elements.add(2,"hoho");
        elements.add(3,"hehe");
        elements.remove(1);
        System.out.println(elements.get(1));
        System.out.println(elements.getSize());
    }
}
