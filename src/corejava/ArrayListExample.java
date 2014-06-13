package corejava;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nat on 2014/03/23.
 */
public class ArrayListExample
{
    public static ArrayList getColaList()
    {
        ArrayList colaList = new ArrayList();
        colaList.add("Coca Cola");
        colaList.add("Pepsi Cola");
        return colaList;
    }

    public static void updateCola(ArrayList colaList)
    {
        colaList.add(Integer.valueOf(1));
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = getColaList();
        updateCola(list);
        for(Object name: list)
        {
            System.out.println(name);
        }
    }
}
