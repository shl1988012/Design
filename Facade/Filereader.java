package design.Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filereader {

	public String read(String fileNameSrc) {
		try {
			FileInputStream fs = new FileInputStream(new File(fileNameSrc));
			StringBuilder sb = new StringBuilder();
			int data;
			while ((data = fs.read()) != -1) {
				sb = sb.append((char) data);
			}
			fs.close();
			return sb.toString();
		} catch (IOException e) {
			System.out.println("读取文件失败");
		}
		return null;
	
	}
}
