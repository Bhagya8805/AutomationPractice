package AssignmentsWithScanner;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No : ");	
		n=obj.nextInt();
		PrimeNo.PrimeNo(n);
	}



	static void PrimeNo(int n) {
		int i,m=0,flag=0;    
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" prime number"); }  
		} 
	}
}