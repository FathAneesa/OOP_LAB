import java.util.Scanner;
import java.util.Arrays;

class Binarysearch{
   int binarysearch(int[] numbers,int target){
      Arrays.sort(numbers);
       
       System.out.println("Array sorted:"+ Arrays.toString(numbers));
       int first=0,last=numbers.length -1;
       while(first<=last){
         int mid=first+(last-first)/2;
         if(numbers[mid]==target){
            System.out.println("element found at index:" +mid);
            return mid;
         }
         else if(numbers[mid]<target){
            first=mid+1;
         }
         else{
            last=mid-1;
         }
     }

     System.out.println("element not found in the array");
     return -1;
  }

public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements:");
     int size=sc.nextInt();
     int[] numbers=new int[size];
     System.out.println("enter the elements of array:");

     for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
     }
 
     System.out.println("enter the element to search");
     int target=sc.nextInt();
     Binarysearch bs=new Binarysearch();
     bs.binarysearch(numbers,target);
}
}

