public class Maxwealth 
{
   public static void main(String args[])
   {

   }
   static int maximumwealth(int[][]accounts)
   {
    //person=row
    //account=column
     int ans=Integer.MIN_VALUE;
       for(int person=0;person<accounts.length;person++)
       {
        //when we start a new column take the new sum for that row
        int sum=0;
         for(int account=0;account<accounts[person].length;account++)
         {
             sum=sum+accounts[person][account];
         }
         //now we have sum of accounts of person
         //check with overall answer
         if(sum>ans)
         {
            ans=sum;
         }
       }
       return ans;
   }    
}
