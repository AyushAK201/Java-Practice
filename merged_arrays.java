import java.util.*;
import java.lang.*;
public class merged_arrays {
    public static void main(String[] args) {
	 int[]nums1={1,2,3,4};
	 int[]nums2={9,7,10,8,11};
	 int[]nums3=new int[nums1.length+nums2.length];
	 int i=0;
	 int j=0;
	 int k=nums3.length/2;
	 for(i=0;i<nums1.length;i++)
	 {
	     int element1=nums1[i];
	     nums3[i]=element1;
	 }
	 System.out.println(Arrays.toString(nums3));
	 while(j<nums2.length && k<nums3.length)
	 {
	     int element2=nums2[j];
	     nums3[k]=element2;
	     j++;
	     k++;
	 }
	 Arrays.sort(nums3);
	 System.out.println(Arrays.toString(nums3));
	}
    
}
