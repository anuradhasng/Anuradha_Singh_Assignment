package com.coforge.Day4;
import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println("enter the key");
	Scanner sc = new Scanner(System.in);
	int key=sc.nextInt();
	int low=0;
	int high=arr.length-1;
	int mid;
	while(low<=high) {
		 mid=(low+high)/2;
		 if(arr[mid]==key) {
			System.out.println("Element found");
			break;
		 }
		 else if(key>arr[mid])
			 low=mid+1;
		 else
			 high=mid-1;
		
		 }
	if(low>high)
		System.out.println("not found");
 
}
}
 
 