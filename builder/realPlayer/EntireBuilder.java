package design.builder.realPlayer;

//完整模式
public class EntireBuilder extends PlayerBuilder{

	public void buildMainWin() {
		super.player.setMainWindow("显示主窗口");
	}

	public void buildMenu() {
		if(isShowMenu()){
			super.player.setMenu("显示菜单");
		}
	}
	public boolean isShowMenu(){
		return false ;
	}
	
	public void buildPlayList() {
		if(isShowPalyList()){
			super.player.setPlayList("显示播放列表");
		}
	}
	public boolean isShowPalyList(){
		return true ;
	}
	
	public void buildControlBar() {
		if(isShowControlBar()){
			super.player.setControlBar("显示控制条");
		}
	}
	public boolean isShowControlBar(){
		return false ;
	}
	
}
