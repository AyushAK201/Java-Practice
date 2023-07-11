import java.util.Arrays;

public class Evendigits2 
{
    public static void main(String args[])
    {
        int[]nums={1200,3450,2,6,7896};
        System.out.println(findNumber(nums));
    }   
    static int findNumber(int[]nums)
    {
       // int len=0;
        int count=0;
        String element=" ";
        for(int i=0;i<nums.length;i++)
    {
           element=nums[i]+"0";
           element=element.substring(0, element.length()-1);
          if(element.length()%2==0)
        {
            System.out.println(element);
            count++;
        }
    }
        return count;
    } 
}
