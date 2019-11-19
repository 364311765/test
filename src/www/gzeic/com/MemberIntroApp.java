package www.gzeic.com;

public class MemberIntroApp {
	public static void main(String[] args) {
		People[] ps = new People[3];
		ps[0] = new People("小明", 19);
		ps[1] = new Student("李四", 18);
		ps[2] = new Teacher("Joun", 30);
		for (int i = 0; i < ps.length ; i++) {
			System.out.print(ps[i].getIntro());
			System.out.println("------------------");
		}
	}
}
