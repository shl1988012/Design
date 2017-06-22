package design.command.demo1;

public class WindowCommand extends Command{

	private WindowHandle handle;
	
	public WindowCommand(WindowHandle handle){
		this.handle = handle ;
	}
	
	@Override
	public void execute() {
		handle.minimize();
	}

}
