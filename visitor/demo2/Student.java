package design.visitor.demo2;

public class Student implements Candidate{

	private String name ;
	private int paperCount;
	private int score ;
	
	public Student(String name,int paperCount, int score){
		this.name = name;
		this.paperCount = paperCount;
		this.score =score;
	}
	
	@Override
	public void accept(Award handle) {
		handle.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaperCount() {
		return paperCount;
	}

	public void setPaperCount(int paperCount) {
		this.paperCount = paperCount;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	
}
