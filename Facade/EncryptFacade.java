package design.Facade;



//外观类
public class EncryptFacade {

	private Filereader fileReader;
	private Filewriter fileWriter;
	private CipherMachine machine ;
	
	 public EncryptFacade()  
     {  
		 fileReader = new Filereader();  
		 machine = new CipherMachine();  
		 fileWriter = new Filewriter();  
     } 
	
	 //调用其他对象的业务方法  
     public void FileEncrypt(String fileNameSrc, String fileNameDes)  
    {  
        String plainStr = fileReader.read(fileNameSrc);  
        String encryptStr = machine.Encrypt(plainStr);  
        fileWriter.Write(encryptStr, fileNameDes);  
    }
	 
}
