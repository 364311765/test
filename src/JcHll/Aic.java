package JcHll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Student> stu = init();

		System.out.println("欢迎进入学生系统");

		System.out.println("本系统当前有" + stu.size() + "条记录");

		getOperation();
		int operation = sc.nextInt();

		while (operation != 0) {

			switch (operation) {
			case 0:

				break;
			case 1:
				System.out.println("------显示------");
				System.out.println(show(stu));
				System.out.println("-----显示结束------");
				getOperation();
				operation = sc.nextInt();
				break;
			default:
				;
			}

		}
		System.out.println("----退出系统------");
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
		res.append("序号\t学号\t姓名" + "\r\n");
		for (int i = 0; i < stu.size(); i++) {
			res.append((i + 1) + "\t" + stu.get(i).get() + "\r\n");
		}
		String n = res.toString();
		return n;
	}

	private static void getOperation() {
		System.out.println("系统具有以下功能：");
		System.out.println("1:显示数据");
		System.out.println("0:退出系统");
		System.out.println("请选择您需要操作的功能：");
	}
}
