package JcHll;

public class CxuHll {
public static void main(String[] args) {
		System.out.println("java´óÉñ");
		int num1=2;
		int num2=7;
		int num3=3;
		int num5=4;
		int num6=10;
		int diff=diff(num1, num2);
		int sum=sum(num1, num3);
		int cheng=cheng(num1, num5);
		int chu=chu(num6, sum);
		System.out.println("1:"+num2+"-"+num1+"="+diff);
        System.out.println("2:"+num3+"+"+num1+"="+sum);
		System.out.println("3:"+num1+"*"+num5+"="+cheng);
		System.out.println("4:"+num6+"/"+sum+"="+chu);
}

private static int chu(int num6, int sum) {
	return num6/sum;
}

private static int cheng(int num1, int num5) {
	return num1*num5;
}

private static int sum(int num1, int num3) {
	return num3+num1;
}

private static int diff(int num1, int num2) {
	return num2-num1;
}


}
