package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\PropertyFiles\\Sample.properties");
		FileOutputStream fos=new FileOutputStream(".\\PropertyFiles\\Sample.properties");
		Properties pos =new Properties();
		pos.load(fis);
		pos.setProperty("Role", "Tester");
		pos.setProperty("id", "1234");
		pos.store(fos, "latest update");
		fos.close();
		

	}

}
