/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray {
   public static void reversearray(int arr[] , int start , int end)
   {
       int temp;
       while(start < end)
       {
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
   }
   public static void printarray(int arr[] , int size)
   {
       for (int i=0; i < size; i++)
           System.out.print(arr[i] + " ");
       System.out.println("");
   }
public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for(int i=0;i<t;i++)
 {
 int n = sc.nextInt();
     int arr[] = new int[n];
     for(int j=0;j<n;j++)
     {
         arr[j] = sc.nextInt();
     }
      reversearray(arr,0,n-1);
     printarray(arr,n);
 }
 
}
}