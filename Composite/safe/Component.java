package design.Composite.safe;

//抽象构件(Component)角色:这是一个抽象角色，它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象
public interface Component {

	public void printStruct (String preStr);
}
