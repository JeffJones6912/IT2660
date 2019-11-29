import javax.swing.*;
import java.util.Random;
public class TDMergeSort
{
    public static void main(String[] args)
    {
        int[] list= new int[100];
        createUnsortedList(list);
        printList(list);
        int[] sorted = mergeSort(list);
        printList(sorted);
    }
    public static void createUnsortedList(int[] array)
    {
        Random rng = new Random();
        for(int i = 0; i < array.length; i++)
        {
            array[i] = rng.nextInt(200);
        }
    }
    public static void printList(int[] L)
    {
        for(int i = 0; i < L.length; i++)
        {
            System.out.println(L[i]);
        }
    }
    public static int[] mergeSort(int[] L)
    {
        if(L.length <= 1)
        {
            return L;//base case
        } //recursive case
        int[] left = new int[L.length/2];
        int[] right = new int[L.length - left.length];
        int j = 0;
        for(int i = 0; i < L.length; i++)
        {
            if(i < L.length/2)
            {
                left[i] = L[i];
            }
            else
            {
                right[j] = L[i];
                j++;
            }
        }
        //Recursively sort both sub-lists
        left= mergeSort(left);
        right = mergeSort(right);
        return merge(left, right); //return sorted sub-lists
    }
    public static int[] merge(int[] Left, int[] Right)
    {
        int[] list = new int[Left.length + Right.length];
        int n = 0;
        while (Left.length != 0 && Right.length != 0)
        {
            if(Left[0] <= Right[0])
            {
                list[n] = Left[0];
                Left = deleteFirst(Left);
                n++;
            }
            else
            {
                list[n] = Right[0];
                Right = deleteFirst(Right);
                n++;
            }
        }
        if (Left.length != 0)
        {
            for(int i = 0; i < Left.length; i++)
            {
                list[n] =  Left[i];
                n++;
            }
        }
        if (Right.length != 0)
        {
            for(int i = 0; i< Right.length; i++)
            {
                list[n] = Right[i];
                n++;
            }
        }
        return list;
    }
    public static int[] deleteFirst(int[] array)
    {
        int[] tempArray = new int[array.length - 1];
        for( int i = 0; i < tempArray.length; i++)
        {
            tempArray[i] = array[i + 1];
        }
        return tempArray;
    }
}
