import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        rotate(a,k);
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
    	public static void rotate(int[] nums, int k) {
    		if(k > nums.length){
    			k = k % nums.length;
    		}
    		int b = nums.length - k; 
    		reverse(nums,0,b-1);
    		reverse(nums,b,nums.length-1);
    		reverse(nums,0,nums.length-1);
    		
    		
            
    	}

    	public static void reverse(int[] arr, int left, int right) {
    		if(arr == null||arr.length == 1){
    			return;
    		}
    		while(left<right){
    			
    			int temp = arr[left];
    			arr[left] = arr[right];
    			arr[right] = temp;
    			left++;
    			right--;
    		
    		}
    	}
}
