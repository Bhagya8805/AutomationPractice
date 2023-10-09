package StringAssignments;

public class ReverseStringPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "I Am Not String";
		      String strArray[] = str.split(" ");
		      StringBuffer sb= new StringBuffer(str);
		      sb.reverse();
		      for(int i=0 ; i<str.length(); i++){
		      if(str.charAt(i)== ' '){
		         sb.insert(i, " ");
		      }
		   }
		   sb.append("");
		   System.out.println(sb);
	}

}
