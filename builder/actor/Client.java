package design.builder.actor;

public class Client {

	public static void main(String[] args) {
		
		ActorBuilder ab= new HeroBuild();
		ActorController ac =new ActorController();
		Actor a =	ac.construct(ab);
		System.out.println(a.getBody());
		System.out.println(a.getHairStyle());
	}
}
