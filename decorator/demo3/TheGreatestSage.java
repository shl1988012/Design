package design.decorator.demo3;


//抽象构建
public interface TheGreatestSage {

	 public void move();
	
	/*public static void main(String[] args) throws IOException {
		DataInputStream dis = null;
		try {

			dis = new DataInputStream(new BufferedInputStream(new FileInputStream("aaa")));

			// 读取文件内容
			byte[] bs = new byte[dis.available()];
			dis.read(bs);
			String content = new String(bs);
			System.out.println(content);
		} finally {
			dis.close();
		}
	}*/
}
