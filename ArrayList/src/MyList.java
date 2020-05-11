public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements ;

    public MyList() {
        elements =  new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
         elements =  new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            E[] newElements = (E[]) new Object[size + minCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public void add(int index, E element) {
        ensureCapacity(1);
        for (int i = size - 1; i > index; i--) {
            elements[i + 1] = elements[i];

        }
        elements[index] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public E remove(int index) {
        if (checkIndex(index)) {
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
        } else {
            E e = (E)elements[index];
            for (int j = index; j < size - 1; j++) {
                elements[j] = elements[j + 1];
            }
            elements[size - 1] = null;
            size--;
            return e;
        }
    }

    private boolean checkIndex(int index) {
        return index < 0 || index >= size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) return i;
        }

        return -1;
    }

    public E get(int index) {
        checkIndex(index);
        return (E)elements[index];

    }
    public void clear() {
        elements =  new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public Object clone(){
        Object[] newElements = new Object[size];
        System.arraycopy(elements, 0, newElements, 0, size);
        return newElements;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }
}
