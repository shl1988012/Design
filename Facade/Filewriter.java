package design.Facade;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewriter {

	public void Write(String encryptStr, String fileNameDes) {
		 try {
			FileOutputStream in = new FileOutputStream(new File(fileNameDes));
			in.write(encryptStr.getBytes(),0,encryptStr.getBytes().length);
			in.flush();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}
