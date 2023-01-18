package list;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] arrList;

    public ArrayList() {
        arrList = new Object[DEFAULT_CAPACITY];
    }

    //Độ dài của mảng nhập vào
    public ArrayList(int capacity) {
        if (capacity > 0) {
            arrList = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public void remove(int index) {
        E element = (E) arrList[index];
        for (int i = index; i < size - 1; i++) {
            arrList[i] = arrList[i + 1];
        }
        arrList[size - 1] = null;
        size--;
    }

    public int size() {
        return size;
    }

    public int length() {
        return arrList.length;
    }

    public void copy() {
        ArrayList<E> copy = new ArrayList<>();
        copy.arrList = Arrays.copyOf(arrList, size);
        copy.size = size;
    }

    public boolean contains(E e) {
        return this.indexOf((String) e) >= 0;
    }

    public int indexOf(String e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arrList[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E arrayList) {
        if (size == arrList.length) {
            ensureCapacity(1);
        }
        arrList[size] = arrayList;
        size++;
        return true;
    }

    public void add(int index, E arrayList) {
        if (index > arrList.length) {
            throw new IllegalArgumentException("lỗi index" + index);
        } else if (arrList.length == index + 1) {
            ensureCapacity(1);
        }
        if (arrList[index] == null) {
            size++;
            arrList[index] = arrayList;
        } else {
            if (size == arrList.length) {
                ensureCapacity(1);
            }
            System.arraycopy(arrList, index, arrList, index + 1, size - index);
            arrList[index] = arrayList;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.arrList.length + minCapacity;
            arrList = Arrays.copyOf(arrList, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + arrList.length);
        }
    }

    public E get(int index) {
        return (E) arrList [index];
    }

    public void clean() {

    }

    public int getSize() {
        return size;
    }

    public Object[] getArrList() {
        return arrList;
    }
}
