package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
public class ArrayListOperation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public  void arraylistOperation()
    {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        while (true) {
            Log.info("\n1.insert\n2.addElement(position,value)\n3.remove(index)\n4.IndexOf\n5.size()\n6.display\n7.RemoveAll\n8.Exit\nEnter the choice:");
            int key = input.nextInt();
            int index;
            int position;
            String print1;
            String value;
            switch (key) {
                case 1 -> {
                    Log.info("Enter the insert value:");
                    value = input.next();
                    arrayList.add(value);
                    Log.info("----Value Is Successfully inserted----");
                }
                case 2 -> {
                    Log.info("Enter the insert value:");
                    value = input.next();
                    Log.info("Enter the Position:");
                    position = input.nextInt();
                    arrayList.add(position, value);
                    Log.info("----Value Is Successfully inserted----");
                }
                case 3 ->
                {
                    Log.info("Enter the remove value of Index:");
                    index = input.nextInt();
                    arrayList.remove(index);
                    Log.info("----Value Is Successfully removed----");
                }

                case 4 -> {
                    Log.info("Enter the String:");
                    String value1=input.next();
                    int position1=arrayList.indexOf(value1);
                    String value2="Index of"+ value1+":"+position1;
                    Log.info(value2);
                }
                case 5->{
                    String print="Size of ArrayList:"+arrayList.size();
                    Log.info(print);
                }
                case 6-> {
                    StringBuilder print=new StringBuilder();
                    for (Object o : arrayList)
                    {
                        print.append(" "+o+" ");
                    }
                    print1=print.toString();
                    Log.info(print1);
                }
                case 7 -> {
                    Log.info("-----Thank You-----");
                    return;
                }
                case 8->{arrayList.clear();Log.info("ArrayList Cleared");}
                case 9->{return;}
                default -> throw new IllegalStateException("Unexpected value: " + key);
            }
        }

    }
}
