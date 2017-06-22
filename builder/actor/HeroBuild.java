package design.builder.actor;

public class HeroBuild extends ActorBuilder {

	public void buildBody() {
		super.actor.setBody("body");
	}

	public void buildHairstyle() {
		actor.setHairStyle("光头");
	}
	
	// 覆盖钩子方法
	public boolean isBareHeader() {
		return false;
	}

	
}
