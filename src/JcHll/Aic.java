package JcHll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Student> stu = init();

		System.out.println("��ӭ����ѧ��ϵͳ");

		System.out.println("��ϵͳ��ǰ��" + stu.size() + "����¼");

		getOperation();
		int operation = sc.nextInt();

		while (operation != 0) {

			switch (operation) {
			case 0:

				break;
			case 1:
				System.out.println("------��ʾ------");
				System.out.println(show(stu));
				System.out.println("-----��ʾ����------");
				getOperation();
				operation = sc.nextInt();
				break;
			default:
				;
			}

		}
		System.out.println("----�˳�ϵͳ------");
	}

	private static List<Student> init() {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student("21800504", "wyx"));
		stu.add(new Student("21800505", "xx"));
		stu.add(new Student("21800509", "zl"));
		return stu;
	}

	private static String show(List<Student> stu) {
		StringBuffer res = new StringBuffer();
		res.append("���\tѧ��\t����" + "\r\n");
		for (int i = 0; i < stu.size(); i++) {
			res.append((i + 1) + "\t" + stu.get(i).get() + "\r\n");
		}
		String n = res.toString();
		return n;
	}

	private static void getOperation() {
		System.out.println("ϵͳ�������¹��ܣ�");
		System.out.println("1:��ʾ����");
		System.out.println("0:�˳�ϵͳ");
		System.out.println("��ѡ������Ҫ�����Ĺ��ܣ�");
	}
}
