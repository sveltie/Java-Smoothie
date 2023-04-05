package array;

import java.lang.reflect.Array;

public class GenSet<E> {
    private E[] a;
    public int length;

    @SuppressWarnings("unchecked")
    public GenSet(Class<E> type, int size) {
        this.a = (E[]) Array.newInstance(type, size);
        this.length = size;
    }

    public E get(int i) {
        return a[i];
    }

    void set(int i, E e) {
        a[i] = e;
    }
}
