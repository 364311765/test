package www.gzeic.com;

public class People {
	private String name;
	private int age;
	private String ability;

	public People(String name, int age, String ability) {
		this.name = name;
		this.age = age;
		this.ability = ability;
	}

	public People(String name, int age) {
		this(name, age, "我是平民，我可以比较任意两个小于等于10的整数的大小。");
	}

	public String getIntro() {
		StringBuffer res = new StringBuffer();

		res.append("Name:" + name + "\r\n");
		res.append("Age:" + age + "\r\n");
		res.append("Ability:" + ability + "\r\n");

		int num1 = (int) (Math.random() * 10);
		res.append("第一个随机数是:" + num1 + "\r\n");
		int num2 = (int) (Math.random() * 10);
		res.append("第二个随机数是:" + num2 + "\r\n");

		int max = num1 > num2 ? num1 : num2;
		System.out.println(num1 + "和" + num2 + "中最大的是:" + max);

		return res.toString();
	}

}
