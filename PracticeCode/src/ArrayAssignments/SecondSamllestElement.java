package ArrayAssignments;

public class SecondSamllestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
System.out.println(SecondSamllest(a,6));

System.out.println(Samllest(a,6));
System.out.println(Samllest1(a,6));
	}
	public static int SecondSamllest(int[] a, int total){  
	 
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
		       return a[1];//2nd element because index starts from 0  
		}  

	public static int Samllest(int[] a, int total){  
	 
		 
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
		       return a[0];//2nd element because index starts from 0  
		} 
	public static int Samllest1(int[] a, int total){ 
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
			if(a[i]>a[j])	{
				a[i]=a[j];
			}
			}
		}
		return a[0];
	}
}
