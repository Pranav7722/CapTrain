package new1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropDemo {
	public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream(".\\src\\test\\java\\stud.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String id=prop.getProperty("Sid");
        System.out.println(id);
        prop.setProperty("Sid", "102");
        System.out.println(prop.getProperty("Sid"));
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
	} catch (IOException e)
	{			
		e.printStackTrace();
	}

}
}

