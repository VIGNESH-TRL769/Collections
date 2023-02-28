package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
public class Array
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public void array()
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
