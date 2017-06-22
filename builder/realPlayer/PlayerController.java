package design.builder.realPlayer;

public class PlayerController {
	
	
	public Player construct(PlayerBuilder pb){
		
		pb.buildControlBar();
		pb.buildMainWin();
		pb.buildMenu();
		pb.buildPlayList();
		
		Player p =	pb.createActor();
		return p;
	} 
	
}
