package design.Composite.transparency;

public	abstract class Component {
	
	public abstract void printStruct(String preStr);
	
	 public void addChild(Component child){
		 	/**
	         * 缺省实现，抛出异常，因为叶子对象没有此功能
	         * 或者子组件没有实现这个功能
	         */
		 throw new UnsupportedOperationException("对象不支持此功能");
	 }
	
	 public void removeChild(Component child){
		 throw new UnsupportedOperationException("对象不支持此功能");
	 }
	 
}
