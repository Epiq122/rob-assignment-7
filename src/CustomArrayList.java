public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int listSize = 0;

    public Object[] biggerArraySize() {
        Object[] newArray = new Object[listSize * 2];
        if (listSize >= 0) System.arraycopy(items, 0, newArray, 0, listSize);
        return newArray;
    }


    @Override
    public boolean add(T item) {
        if (listSize >= items.length) {
            items = biggerArraySize();

        }
        items[listSize++] = item;


        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index > listSize) {
            throw new IndexOutOfBoundsException("Item " + item + " cannot be added to index:" + index);
        }
        if (listSize == items.length) {
            items = biggerArraySize();
        }
        for (int i = listSize - 1; i > index - 1; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        listSize++;

        return true;
    }

    @Override
    public int getSize() {
        return listSize;
    }


    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= listSize)
            throw new IndexOutOfBoundsException("The index : " + index + " is out of bounds");
        return (T) items[index];
    }


    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index >= listSize || index < 0) throw new IndexOutOfBoundsException("The index: " + index + " is out of " +
                "bounds");
        T itemRemoved = (T) items[index];
        for (int i = index; i < listSize - 1; i++) {
            items[i] = items[i + 1];
        }

        listSize--;
        return itemRemoved;
    }


}
