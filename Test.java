public class Test {
    public static void main(String[] Args)
    {
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("Test add(val) and get(index): add 5 values to list, and then get 5 values from the list");
        System.out.println("Expected: 10 20 30 40 50");
        for (int val = 10; val <= 50; val += 10)
        {
            list.add(val);
        }
        System.out.println(list);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Test add(val): add the 11th item to the list (causes an array resize)");
        System.out.println("Expected: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110");
        for (int val = 60; val <= 110; val +=10)
        {
            list.add(val);
        }
        System.out.println(list);
        System.out.println();
        System.out.println();


        System.out.println("remove(5): ");
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println();

        System.out.println("add(2,100): ");
        list.add(2,100);
        System.out.println(list);
        System.out.println();

        System.out.println("contains(100): ");
        System.out.println(list.contains(100));
        System.out.println(list);
        System.out.println();

        System.out.println("get(2): ");
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println();

        System.out.println("size(): ");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();

        System.out.println("indexOf(100): ");
        System.out.println(list.indexOf(100));
        System.out.println(list);
        System.out.println();

        System.out.println("isEmpty(): ");
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println();

        IntegerArrayList list2 = new IntegerArrayList();
        for (int val = 10; val <= 60; val +=10)
        {
            list2.add(val);
        }
        list2.remove(5);
        list2.add(2,100);
        System.out.println("list 2: ");
        System.out.println(list2);
        System.out.println();

        System.out.println("equals(list2): ");
        System.out.println(list.equals(list2));
        System.out.println("list: ");
        System.out.println(list);
        System.out.println("list2: ");
        System.out.println(list2);
        System.out.println();

        System.out.println("size(): ");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();

    }
}
