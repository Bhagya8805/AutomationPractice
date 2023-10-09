package AssignmentRandom;

public class CharOccurance {
	//find number of time "AB" in string str = "ABBBDFJGGDFABFJFHYDAB";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABBBDFJGGDFABFJFHYDAB";
		
		int count = 0;
		int index = 0;
		String str1 = "AB";	


		while(!(index<0))
		{			
			index = str.indexOf("AB");
			if (index>=0)
			{
				count++;
				index ++;
				str = str.substring(index);	
			}


		}



		/*for (int i=0; i<str.length()-1;i++)
		{
			if (str.charAt(i)=='A' && str.charAt(i+1)=='B' )
			{
				count++;
			}

		}*/


		System.out.println("Number of time AB is  = "+count);


	}
}
