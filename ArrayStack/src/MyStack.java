public class MyStack {
    private int[] Arr;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        this.index =0;
        Arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        Arr[index] = element;
        index++;

    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return Arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        } else return false;

    }
    public boolean isFull(){
        if (index == size){
            return true;
        }else return false;

    }
}
