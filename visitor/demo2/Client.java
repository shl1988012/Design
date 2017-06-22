package design.visitor.demo2;

public class Client {

	public static void main(String[] args) {

		CandidateList c = new CandidateList();

		Student s1 = new Student("aaa", 3, 80);
		Student s2 = new Student("bbb", 1, 91);
		Student s3 = new Student("ccc", 3, 92);
		Teacher t1 = new Teacher("ddd", 11, 80);
		Teacher t2 = new Teacher("eee", 1, 97);
		Teacher t3 = new Teacher("fff", 11, 99);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(t1);
		c.add(t2);
		c.add(t3);

		Award dep = new LearnAward();
		c.accept(dep);
		System.out.println("==============");
		Award dep1 = new ScientificAward();
		c.accept(dep1);
	}
}
