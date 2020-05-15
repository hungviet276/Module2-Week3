public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(E[] objects) {
        for (int i =0; i < objects.length;i++){
            insert(objects[i]);
        }
    }


    @Override
    public boolean insert(E e) {
        return true;
    }



    @Override
    public int getSize() {
        return 0;
    }
}
