package design.visitor.demo2;

import java.util.ArrayList;
import java.util.List;

public class CandidateList {

	public List<Candidate> list = new ArrayList<Candidate>(10);
	
	public void add(Candidate c){
		list.add(c);
	}
	
	public void accept(Award award){
		
		for(Candidate c: list){
			c.accept(award);
		}
	}
}
