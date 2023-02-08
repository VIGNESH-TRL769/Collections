package org.example;
import java.util.Scanner;
import java.util.logging.Logger;

class LinkedList
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    Node head;
    Node tail;
    int length=0;
    LinkedList()
    {
        head=null;
        tail=null;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(this.head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
        this.length++;
       Log.info("----Your Value is Successfully Inserted----\n");
    }
    public void display()
    {
        StringBuilder print=new StringBuilder();
        Node temp=this.head;
        if(temp==null)
        {
          Log.info("It is empty");
        }
        else
        {
            while(temp!=null)
            {
                print.append(" "+temp.data+" ");
                temp=temp.next;
            }
            String print1=""+print;
            Log.info(print1);
            print.delete(0,print1.length());
        }
    }
    public  void insertElement(int value,int position)
    {
        Node temp=this.head;
        Node k=new Node(value);
        Node t=temp;
        if(position==0)
        {
            k.next=this.head;
            this.head=k;
            this.length++;
           Log.info("---Your Value is Successfully Inserted---\n");
        }
        else if(length<position)
        {
           Log.info("Please enter valid range");
        }
        else
        {
            for(int i=0;i<position-1;i++)
            {
                t=temp;
                temp=temp.next;
            }
            t.next=k;
            k.next=temp;
            this.length++;
           Log.info("-----Your Value is Successfully Inserted-----\n");
        }

    }
    public void remove(int index)
    {
        if(index==0)
        {
            this.head=this.head.next;
            this.length--;
           Log.info("-----Your Value is Successfully Remove Of Index-----\n");
        }
        else if(index>=length)
        {
           Log.info("Please Enter Valid Range\n");
        }
        else
        {
            Node temp=this.head;
            Node t=temp;
            for(int i=0;i<index;i++)
            {
                t=temp;
                temp=temp.next;
            }
            t.next=temp.next;
            this.length--;
            String print="-----Your Value is Successfully Remove from the Index:"+index+"-----\n";
           Log.info(print);
        }

    }
    public void maxmin()
    {
        Node temp=this.head;
        int max=0;
        int min=this.head.data;
        for(int i=0;i<length;i++)
        {
            if(max<temp.data)
            {
                max=temp.data;
            }
            if(min>temp.data)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
       String minmax="max Value:"+max+"\nmin Value:"+min;
       Log.info(minmax);
    }
    public void push(int val)
    {
        Node node=new Node(val);
        if(this.head==null)
        {
            this.head=node;
            this.tail=node;
        }
        else
        {
            this.tail.next=node;
            this.tail=node;
        }
        this.length++;
       Log.info("-----Your Value is Successfully Pushed-----\n");

    }
    public  void pop()
    {
        if(this.length>=0)
        {
           Log.info("Stack is empty");
        }
        else
        {
            Node temp=this.head;
            for(int i=0;i<this.length-2;i++)
            {
                temp=temp.next;
            }
            temp.next=null;
            Log.info("-----Your Value is Successfully Poped-----\n");

        }


    }
}
public class LinkedListOperation
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public static void main(String[] args)
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
                default -> {Log.info("Please Enter Valid Option");}
            }
        }
    }
}