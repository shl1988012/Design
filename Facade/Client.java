package design.Facade;

public class Client {

	public static void main(String[] args) {
		
//		File file = new File("src.txt");
//		System.out.println(file.getAbsolutePath());
		 EncryptFacade ef = new EncryptFacade();  
         ef.FileEncrypt("src.txt", "des.txt");  
//		 ef.FileEncrypt("C:\\Users\\Administrator\\Desktop\\src.txt", "C:\\Users\\Administrator\\Desktop\\des.txt"); 
	}
}
