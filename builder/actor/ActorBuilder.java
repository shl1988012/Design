package design.builder.actor;

public abstract class ActorBuilder {
	
	protected  Actor actor = new Actor();
	
	public abstract void buildBody();
	public  abstract void buildHairstyle();
	//钩子方法
	public boolean isBareHeader(){
		return false ;
	}
	
	
	//工厂方法，返回一个完整的游戏角色对象
    public Actor createActor()
    {
           return actor;
    }
}
