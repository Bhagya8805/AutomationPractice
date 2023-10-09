package ArrayAssignments;

public class ThirdLargest {

	public static int getThirdLargest(int[] a, int total)
	{  
		int temp;  
	for (int i = 0; i < total; i++)   
	{  
		for (int j = i + 1; j < total; j++)   
		{  
			if (a[i] > a[j])   
			{  
				temp = a[i];  
				a[i] = a[j];  
				a[j] = temp;  
			}  
		}  
	}  
	return a[total-3];  
	}  
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		} 
	public static int Largest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                   
		                    a[i] = a[j];  
	 
		                }  
		            }  
		        }  
		       return a[total-1];  
		} 
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		System.out.println("Third Largest: "+getThirdLargest(a,6));  	  
		System.out.println("Second Largest: "+getSecondLargest(a,6));
		System.out.println("Largest Among all: "+Largest(a,6));

}

}
