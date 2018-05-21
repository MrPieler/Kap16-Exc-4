package Exc4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exc4
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);

        System.out.println(list.lastIndexOf(5));

    }

    private static Integer lastIndexOf(List<Integer> list, Integer value)
    {
        Integer index = -1;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i)==value)
            {
                index = i;
            }
        }
        return index;
    }
}
