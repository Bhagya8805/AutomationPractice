package Assignments;

import java.util.Arrays;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {1,2,2,4,5,5};
		//Practice3.CopyElement(arr1);
		Practice3.CountEach(arr1);
		Practice3.LeftRotate(arr1, 3);
		RightRotate(arr1,2);

	}
	static void CopyElement(int arr1[]) {
		int arr2[]=new int[arr1.length];

		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of original array: ");    
		for (int i = 0; i < arr1.length; i++) {     
			System.out.print(arr1[i] + " ");    
		}     

		System.out.println();    

		//Displaying elements of array arr2     
		System.out.println("Elements of new array: ");    
		for (int i = 0; i < arr2.length; i++) {     
			System.out.print(arr2[i] + " ");    
		}     
	}
	static void CountEach(int arr1[]) {
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++) {
			int count=1;
			while(i!=arr1.length-1 && arr1[i]==arr1[i+1]) {
				i++;
				count++;
			}
			System.out.println(arr1[i]+" "+count);
		}


	}
	static void LeftRotate(int arr1[],int n) {
		for(int i = 0; i < n; i++){  
			int j, first;  
			//Stores the first element of the array  
			first = arr1[0];  
			for(j = 0; j < arr1.length-1; j++){  
				//Shift element of array by one  
				arr1[j] = arr1[j+1];  
			}  
			//First element of array will be added to the end  
			arr1[j] = first;  
		}
		for(int b:arr1) {
			System.out.print(b+ " ");
		}
System.out.println();
	}

	static void RightRotate(int arr1[],int n) {
		for(int i = 0; i < n; i++){  
			int j, last;  
			//Stores the first element of the array  
			last = arr1[arr1.length-1];  
			for(j = arr1.length-1; j > 0; j--){  
				//Shift element of array by one  
				arr1[j] = arr1[j-1];  
			}  
			//First element of array will be added to the end  
			arr1[j] = last;  
		}
		for(int b:arr1) {
			System.out.print(b+ " ");
		}

	}



}

