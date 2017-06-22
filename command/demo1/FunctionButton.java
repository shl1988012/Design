package design.command.demo1;

public class FunctionButton {

	private Command command;
	private String name;

	public FunctionButton(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// 为功能键注入命令
	public void setCommand(Command command) {
		this.command = command;
	}

	public void onClick() {
		System.out.print("点击功能键：");
		command.execute();
	}
}
