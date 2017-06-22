package design.builder.realPlayer;


public abstract class PlayerBuilder {

	public Player player =new Player();
	
	public abstract void  buildMainWin();
	
	public abstract void buildMenu();
	//钩子方法
	public boolean isShowMenu(){
		return false ;
	}
	
	public abstract void buildPlayList();
	//钩子方法
	public boolean isShowPalyList(){
		return false ;
	}
	
	public abstract void buildControlBar();
	//钩子方法
	public boolean isShowControlBar(){
		return false ;
	}
	
	//工厂方法，返回一个完整的游戏角色对象
    public Player createActor()
    {
           return player;
    }
	
	
}
