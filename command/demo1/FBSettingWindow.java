package design.command.demo1;

import java.util.ArrayList;
import java.util.List;

//功能键设置窗口类  
public class FBSettingWindow {

	private String name; // 窗口标题
	// 定义一个ArrayList来存储所有功能键
	private List<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

	public FBSettingWindow(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addFunctionButton(FunctionButton fb) {
		functionButtons.add(fb);
	}

	public void removeFunctionButton(FunctionButton fb) {
		functionButtons.remove(fb);
	}

	// 显示窗口及功能键
	public void display() {
		System.out.println("显示窗口：" + this.name);
		System.out.println("显示功能键：");
		for (Object obj : functionButtons) {
			System.out.println(((FunctionButton) obj).getName());
		}
		System.out.println("------------------------------");
	}

}
