package design.builder.realPlayer;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		PlayerBuilder builder = new EntireBuilder();
		PlayerController controller = new PlayerController();
		Player p =	controller.construct(builder);
		System.out.println(p.getControlBar());
		System.out.println(p.getMainWindow());
		System.out.println(p.getMenu());
		System.out.println(p.getPlayList());
	}
}
