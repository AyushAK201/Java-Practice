import java.util.Arrays;

public class SortedMatrixsearch 
{
    public static void main(String args[])
    {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
       System.out.println(Arrays.toString(search(arr, 6)));
    }
    //search in the row provided between the columns provided
    static int[] binarysearch(int[][]matrix,int row,int target,int cstart,int cend)
    {
        while(cstart<=cend)
        {
            int mid=(cstart+cend)/2;
            if(matrix[row][mid]==target)
            {
               return new int[]{row,mid};
            }
            if(matrix[row][mid]<target)
            {
                cstart=mid+1;
            }
            else
            {
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][]matrix,int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length;//be cautious over here,matrix may be empty;
        if(rows==1)
        {
            return binarysearch(matrix, 0,0, cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int midcol=cols/2;
         //run the loop till 2 rows are remaining
         while(rstart<rend-1)//while this is true it will have more than 2 rows
         {
            int middle=(rstart+rend)/2;
            if(matrix[middle][midcol]==target)
            { 
               return new int[]{middle,midcol};
            }
            if(matrix[middle][midcol]<target)
            {
                rstart=middle;
            }
            else
            {
                rend=middle;
            }
         }
         //now we have 2 rows
         //check weather the target is in the column of two rows
         if(matrix[rstart+1][midcol]==target)
         {
            return new int[]{rstart+1,midcol};
         }
         //search in first half
         if(target<=matrix[rstart][midcol-1])
         {
           return binarysearch(matrix, rstart,0,midcol-1,target);
         } 
         //search in 2nd half
         if(target>=matrix[rstart][midcol+1]&&target<=matrix[rstart][cols-1])
         {
            return binarysearch(matrix, rstart,midcol+1,cols-1,target);
         }
         //search in 3rd half
         if(target<=matrix[rstart+1][midcol-1])
         {
            return binarysearch(matrix, rstart+1,0, midcol-1, target);
         }
         //search in 4th half
         if(target>=matrix[rstart+1][midcol+1])
         {
            return binarysearch(matrix, rstart+1,midcol+1, cols-1, target);
         }
         return new int[]{-1,-1};

    }    
}
