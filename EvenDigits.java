public class EvenDigits 
{
    public static void main(String args[])
    {
       int[] nums={12,345,2,6,7896};
       System.out.println(findnumber(nums));

    }  
    static int findnumber(int[]nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contains even digit or not
    static boolean even(int num)
    {
        int no_ofdigits=digits(num);
        if(no_ofdigits%2==0)
        {
            return true;
        }
        return false;
    }
    static int digits(int num)
    {
        int count =0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
