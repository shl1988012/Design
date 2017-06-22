package design.command.demo1;

public class HelpCommand extends Command {

	private HelpHandler hhObj; // 维持对请求接收者的引用

	public HelpCommand() {
		hhObj = new HelpHandler();
	}

	@Override
	public void execute() {
		hhObj.display();
	}

}
