package design.Memento.chess;

public class Client {

	public static void display(Chessman chess) {  
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");  
    }  
	
	public static void main(String[] args) {
		
		MementoCaretaker mc = new MementoCaretaker();  
        Chessman chess = new Chessman("车",1,1);
        display(chess);
        mc.setMemento(chess.save());
        chess.setY(4);
        display(chess);
        mc.setMemento(chess.save());
        chess.setY(11);
        display(chess);	//这一步未保存
        System.out.println("******悔棋******");  
        
        chess.restore(mc.getMemento());
        display(chess);
	}
}
