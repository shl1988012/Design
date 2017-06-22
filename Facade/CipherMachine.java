package design.Facade;

public class CipherMachine {

	public String Encrypt(String plainText) {
		String es = "";
		char[] chars = plainText.toCharArray();
		for (char ch : chars) {
			String str = (ch % 7) + "";
			es += str;
		}
		return es ;
	}

}
