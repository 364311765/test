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
		this(name, age, "����ƽ���ҿ��ԱȽ���������С�ڵ���10�������Ĵ�С��");
	}

	public String getIntro() {
		StringBuffer res = new StringBuffer();

		res.append("Name:" + name + "\r\n");
		res.append("Age:" + age + "\r\n");
		res.append("Ability:" + ability + "\r\n");

		int num1 = (int) (Math.random() * 10);
		res.append("��һ���������:" + num1 + "\r\n");
		int num2 = (int) (Math.random() * 10);
		res.append("�ڶ����������:" + num2 + "\r\n");

		int max = num1 > num2 ? num1 : num2;
		System.out.println(num1 + "��" + num2 + "��������:" + max);

		return res.toString();
	}

}
