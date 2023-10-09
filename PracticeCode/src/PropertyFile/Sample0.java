package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample0 {

	public static void main(String[] args) throws IOException {
		
FileInputStream fis=new FileInputStream(".\\PropertyFiles\\Sample.properties");
Properties pos=new Properties();
pos.load(fis);
System.out.println(pos.get("Name"));



	}

}
