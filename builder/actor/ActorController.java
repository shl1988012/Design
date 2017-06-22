package design.builder.actor;

//指挥者
public class ActorController {

	
	 //逐步构建复杂产品对象
	public Actor construct( ActorBuilder ab){
		
		ab.buildBody();
		 //通过钩子方法来控制产品的构建
        if(!ab.isBareHeader())
        {
        	ab.buildHairstyle();
        }
        
        Actor	actor= ab.createActor();
		return actor ;
	}
}
