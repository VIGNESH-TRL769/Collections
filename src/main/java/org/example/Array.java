package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
class ArrayOperation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));

    int size;
    int[] array;
    public void arraySizeIncress()
    {
        int[] temp =new int[size+1];
        for(int i=0;i<size;i++)
        {
            temp[i]=array[i];
        }
        array=temp;
        size++;
    }
    public void arraySizeDecress()
    {
        int[] temp =new int[size-1];
        for(int i=0;i<size-1;i++)
        {
            temp[i]=array[i];
        }
        array=temp;
        size--;
    }
    public void insert(int value)
    {
        arraySizeIncress();
        array[size-1]=value;
        Log.info("---Your Value is Successfully Inserted---\n");
    }
    public void addElement(int value,int index)
    {
        if(index<size) {
            arraySizeIncress();
            for (int i = size - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            Log.info("----Your Value is Successfully Inserted----\n");
        }
        else
        {
            Log.info("Please Enter Valid Range");
        }
    }
    public void remove(int index)
    {
        if(index<size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            arraySizeDecress();
            Log.info("-----Your Value is Successfully Remove Of Index-----\n");
        }
        else
        {
            Log.info("Please Enter Valid Range");
        }
    }
    public void push(int value)
    {
        insert(value);
        Log.info("-----Your Value is Successfully Pushed-----\n");
    }
    public void pop()
    {
        if(size>0)
        {
            arraySizeDecress();
            Log.info("-----Your Value is Successfully Pushed-----\n");
        }
        else
        {
            Log.info("Array is Empty");
        }

    }
    public void max()
    {
        int max=array[0];
        for(int i=1;i<size;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        String maximum="Minimum value:"+max;
        Log.info(maximum);

    }
    public void min()
    {
        int min=array[0];
        for(int i=1;i<size;i++)
        {
            if(min>array[i])
            {
                min=array[i];
            }
        }
        String minimum="Minimum value:"+min;
        Log.info(minimum);

    }
    public void display()
    {
        StringBuilder print=new StringBuilder();
        for(int i=0;i<size;i++)
        {
            print.append(" "+array[i]+" ");
        }
        String print1=""+print;
        Log.info(print1);
        print.delete(0,print1.length());


    }
    public void sort()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        Log.info("-----Array is Successfully Sorted-----\n");
    }

}
public class Array
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public static void main(String[] args)
    {
        ArrayOperation arrayOperation=new ArrayOperation();
        Scanner input=new Scanner(System.in);
        while (true) {
            Log.info("\n1.insert\n2.addElement(value,position)\n3.remove(index)\n4.push(value)\n5.pop()\n6.sort\n7.MaxValue\n8.MinValue\n9.Display\n10.Exit\nEnter the choice:");
            int key = input.nextInt();
            int index;
            int position;
            int value;
            switch (key) {
                case 1 -> {
                    Log.info("Enter the insert value:");
                    value = input.nextInt();
                    arrayOperation.insert(value);
                }
                case 2 -> {
                    Log.info("Enter the insert value:");
                    value = input.nextInt();
                    Log.info("Enter the Position:");
                    position = input.nextInt();
                    arrayOperation.addElement(value, position);
                }
                case 3 ->
                {
                    Log.info("Enter the remove value of Index:");
                    index = input.nextInt();
                    arrayOperation.remove(index);
                }
                case 4 -> {
                    Log.info("Enter the push value:");
                    value = input.nextInt();
                    arrayOperation.push(value);
                }
                case 5 -> arrayOperation.pop();
                case 6 -> arrayOperation.sort();
                case 7 -> arrayOperation.max();
                case 8 -> arrayOperation.min();
                case 9 -> arrayOperation.display();
                case 10 -> {
                    return;

                }
                default-> Log.info("Enter the Valid Option");
            }
        }
    }
}
