package JcHll;

public class Student {
	private String sId;
	private String name;

	public Student(String sId, String name) {
		this.name = name;
		this.sId = sId;
	}

	public String get() {
		return sId + "\t" + name;
	}

}
