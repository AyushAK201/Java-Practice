import java.util.ArrayList;
public class Linearsearch 
{
    public static void main(String args[])
    {
       int[] arr={1,2,3,4,5};
       int target=3;
       System.out.println(findelement(arr, target, 0));
       System.out.println(findelementlast(arr, target, arr.length-1));
    //    findallindex(arr, target, 0);
    //    System.out.println(list);
       System.out.println(findallindex(arr, target, 0, new ArrayList<>()));
       System.out.println(findallindex2(arr, 4, 0));
    }    
    static int findelement(int[]arr,int target,int index)
    {
        if(index==arr.length-1)
        {
            return -1;
        }
        else if(arr[index]==target)
        {
           return index; 
        }
        else
        {
            return findelement(arr, target, index+1);
        }
    }
    static int findelementlast(int[]arr,int target,int index)
    {
        if(index==arr[0]-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
           return index; 
        }
        else
        {
            return findelementlast(arr, target, index-1);
        }
    }
//    static ArrayList<Integer>list=new ArrayList<>();
//     static void findallindex(int[]arr,int target,int index)
//     {
//         if(index==arr[0]-1)
//         {
//             return ;
//         }
//         if(arr[index]==target)
//         {
//            list.add(index);
//         }
//         findallindex(arr, target, index+1);
//     }
static ArrayList<Integer> findallindex(int[]arr,int target,int index,ArrayList<Integer>list)
    {
        if(index==arr.length-1);
        {
            return list;
        }
        if(arr[index]==target)
        {
           list.add(index);
        }
        return findallindex(arr, target, index+1,list);
    }
    static ArrayList<Integer> findallindex2(int[]arr,int target,int index)
    {
        ArrayList<Integer>list =new ArrayList<>();
        if(index==arr.length-1);
        {
            return list;
        }
        //this will contain the answer for that function call only
        if(arr[index]==target)
        {
           list.add(index);
        }
        ArrayList<Integer>ansFromBelowCalls= findallindex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
