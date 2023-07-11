import java.util.*;
import java.lang.*;
public class LinkedList
{
    public ListNode head;;
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
     System.out.print(current.data+"-->");
     current=current.next;
  }
  System.out.print("null");
  System.out.println("\n");
}
public static void main(String args[])
{
   LinkedList l1=new LinkedList();
   l1.head=new ListNode(2);
   ListNode second1=new ListNode(4);
   ListNode third1=new ListNode(3);
   l1.head.next=second1;
   second1.next=third1;
   third1.next=null;
   l1.Display();
   LinkedList l2=new LinkedList();
   l2.head=new ListNode(5);
   ListNode second2=new ListNode(6);
   ListNode third2=new ListNode(4);
   l2.head.next=second2;
   second2.next=third2;
   third2.next=null;
   l2.Display();
   int sum1=0;
   int sum2=0;
   int sum3=0;
   int carry=0;
   sum1=l1.head.data + l2.head.data;
   sum2=l1.head.next.data+ l2.head.next.data;
   sum3=l1.head.next.next.data+ l2.head.next.next.data;
   if(sum2>=10 || sum3>=10)
   {
    carry=sum2/10;
    sum2=(l1.head.next.data+ l2.head.next.data)%10;
    sum3=(l1.head.next.next.data+ l2.head.next.next.data)%10+carry;
   }
   LinkedList l3= new LinkedList();
   l3.head=new ListNode(sum1);
   ListNode second3=new ListNode(sum2);
   ListNode third3=new ListNode(sum3);
   l3.head.next=second3;
   second3.next=third3;
   third3.next=null;
   l3.Display();
}
}
