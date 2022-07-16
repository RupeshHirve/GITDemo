package globalDrive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {

		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\hirve\\Desktop\\Work space\\Java Codes\\src\\globalDrive\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "ie");
		System.out.println(prop.getProperty("browser"));
		
		//for changing the data from the properties file, need to use File Output stream
		FileOutputStream fos= new FileOutputStream("C:\\Users\\hirve\\Desktop\\Work space\\Java Codes\\src\\globalDrive\\data.properties");
		prop.store(fos, null);
		

	}

}
