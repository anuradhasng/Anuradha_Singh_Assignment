package TrainingCoforge.Project;

import java.util.Scanner;

public class DemoOnArrays {
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		
		System.out.println("Array of even numbers");
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
			//if(arr[i]%2==0)
			System.out.println(sum);
	}

}
