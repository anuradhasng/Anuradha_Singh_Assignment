package TrainingCoforge.Project;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {76,45,12,87,59};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for (;i<arr.length;i++)
			if(arr[i]==key) {
				System.out.println("Element Found");
				break;
			}
			if(i==arr.length)
				System.out.println("Not Found");
		        
		
	

	}

}
