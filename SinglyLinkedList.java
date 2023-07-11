import java.util.*;
import java.lang.*;
public class SinglyLinkedList
{
    public ListNode head;
    public static class ListNode
    {
        public int data;
        public ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void Display()
    {
       ListNode current=head;
       System.out.println("The linked list is ");
       while(current!=null)
       {
         System.out.print(current.data+"->");
         current=current.next;
       }
       System.out.print("null");
    }
    public int Length()
    {
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertionatfirst(int value)
    { 
        ListNode L1=new ListNode(value);
        L1.next=head;
        head=L1;
          
    }
    public void insertionatlast(int value)
    {
        ListNode l2=new ListNode(value);
        if(head==null)
        {
            head=l2;
            return;
        }
        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=l2;
    }
    public void insertionatagivenposition(int value,int pos)
    {
        ListNode l3=new ListNode(value);
         if(pos==1)
         {
            l3.next=head;
            head=l3;
         }
         else{
            ListNode previous=head;
            int count=1;
            while(count<pos-1)
            {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=l3;
            l3.next=current;

         }
    }
    public void deletefirstnode()
    {
        ListNode temp=head;
        ListNode current=head.next;
        head=current;
        temp.next=null;
    }
     public ListNode deleteatlast()
     {
        if(head==null || head.next==null)
        return null;
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
     }
 public static void main(String args[])
{
    SinglyLinkedList s1=new SinglyLinkedList();
    s1.head=new ListNode(10);
    ListNode second=new ListNode(1);
    ListNode third=new ListNode(8);
    ListNode fourth=new ListNode(11);
    s1.head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=null;
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
    //Insertion at the beginning
    s1.insertionatfirst(12);
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
    //Insertion at the last
    s1.insertionatlast(13);
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
    //Insertion at the any given position
    s1.insertionatagivenposition(15, 3);
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
    //Deletion of the first node 
    s1.deletefirstnode();
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
    s1.deleteatlast();
    s1.Display();
    s1.Length();
    System.out.print("\n");
    System.out.println("The lenght of the Linked list is " +s1.Length());
}
}