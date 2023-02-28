package org.example;
import java.util.Scanner;
import java.util.logging.Logger;


public class LinkedListOperation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public  void linkedlistOperation()
    {
        Scanner input = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        while (true) {
           Log.info("\n1.insert\n2.insertElement(value,position)\n3.remove(index)\n4.push(value)\n5.pop()\n6.Display\n7.Max-Min Value\n8.Exit\nEnter the choice:");
            int key = input.nextInt();
            int index;
            int position;
            int value;
            switch (key) {
                case 1 -> {
                   Log.info("Enter the insert value:");
                    value = input.nextInt();
                    list1.insert(value);
                }
                case 2 -> {
                   Log.info("Enter the insert value:");
                    value = input.nextInt();
                   Log.info("Enter the Position:");
                    position = input.nextInt();
                    list1.insertElement(value, position);
                }
                case 3 -> {
                   Log.info("Enter the remove value of Index:");
                    index = input.nextInt();
                    list1.remove(index);
                }
                case 4 -> {
                   Log.info("Enter the push value:");
                    value = input.nextInt();
                    list1.push(value);
                }
                case 5 -> list1.pop();
                case 6 -> list1.display();
                case 7 -> list1.maxmin();
                case 8 -> {
                    Log.info("-----Thank You-----");
                    return;
                }
                default -> Log.info("Please Enter Valid Option");
            }
        }
    }
}