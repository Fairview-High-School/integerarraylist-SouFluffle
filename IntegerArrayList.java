import java.util.Arrays;

public class IntegerArrayList implements IntegerList{
    private Integer[] data;
    private int size;

    public IntegerArrayList()
    {
        size = 0;
        data = new Integer[10];
    }

    public void add(Integer val)
    {
        if (size >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length*2];
            for (int i = 0; i < data.length; i++)
            {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val)
    {
        if (size >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length*2];
            for (int i = 0; i < data.length; i++)
            {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        else
        {
            for (int i = size - 1; i >= index; i--)
            {
                data[i + 1] = data[i];
            }
            data[index] = val;
            size++;
        }
    }

    public void set(int index, Integer val)
    {
        data[index] = val;
    }
    public void clear()
    {
        Integer[] emptyArray = new Integer[0];
        data = emptyArray;
    }
    public Integer remove(int index)
    {
        int temp = 0;
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        else
        {
            temp = data[index];
            for (int i = index; i < size - 1; i++)
            {
                data[i] = data[i+1];
            }
            data[size - 1] = 0;
            size--;
        }
        return temp;
    }
    public Integer get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        else
        {
            return data[index];
        }

    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()//(returns true if .size() is 0)
    {
        return size == 0;
    }
    public boolean contains(Integer val)// (returns true if the IntegerArrayList contains the given val, false otherwise)
    {
        int num = 0;
        boolean contains = false;
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == val)
            {
                num++;
            }
        }
        if (num > 0)
        {
            contains = true;
        }
        return contains;

    }
    public int indexOf(Integer val)// (returns the index of the first instance of val that appears in the IntegerArrayList, or -1 if it does not appear)
    {
        int ind = -2;
        for (int i = 0; i < data.length; i++)
        {
            if (data[i].equals(val))
            {
                ind = i;
                break;
            }
        }
        return ind;
    }
    public boolean equals(List<Integer> other)// (returns true if this IntegerArrayList and the other IntegerArrayList have all of the same elements in the same order.
    {
        boolean equals = false;
        if (size == other.size())
        {
            for (int i = 0; i < size; i++)
            {
                if (data[i].equals(other.get(i)))
                {
                    equals = true;
                }
                else
                {
                    equals = false;
                    break;
                }
            }
        }
        return equals;
    }
    public String toString()// returns a nice representation of all of the elements in the IntegerArrayList with commons, and square brackets.
    {
        String result = "[";
        for (int i = 0; i < size-1; i++) {
            result += data[i] + ",";
        }
        result += data[size - 1] + "]";
        return result;
    }
}
