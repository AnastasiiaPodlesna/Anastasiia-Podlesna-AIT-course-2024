package ilist.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IlistImpl implements IList
{
    Object[] elements;
    private int size;

    public IlistImpl(int initialCapacity)
    {
        if (initialCapacity < 0)
        {
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public IlistImpl()
    {
        this(10); // начальный массив на 10 элементов
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public void clean()
    {
        for (int i = 0; i < size; i++)
        {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element)
    {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity()
    {
        if(size == elements.length)
        {
            if(size == Integer.MAX_VALUE)
            {
                throw new OutOfMemoryError();
            }
            int newCapacity = elements.length + elements.length / 2;
            if(newCapacity < 0)
            {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public boolean contain(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean add(int index,
            Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int Index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        IList.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return IList.super.spliterator();
    }
}
