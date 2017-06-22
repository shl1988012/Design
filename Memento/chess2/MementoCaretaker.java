package design.Memento.chess2;

import java.util.ArrayList;
import java.util.List;

//象棋棋子备忘录管理类：负责人
public class MementoCaretaker {

	private List<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>();

	public ChessmanMemento getMemento(int i) {
		return mementolist.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		mementolist.add(memento);
	}

}
