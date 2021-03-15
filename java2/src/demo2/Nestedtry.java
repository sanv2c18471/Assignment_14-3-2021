package demo2;

public class Nestedtry {
	public void case1() {
		int i=90/1;
	}
	public void case2() {
		int a[]=new int[5];
		a[10]=50;
	}
	public void case3() {
		try {
			case1();
			System.out.println("no exception in case1");
			try {
				case2();
				System.out.println("no exception in case2");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutBoundsException");
			}
		}catch(ArithmeticException e) {
			System.out.println("ArithemeticException");
		}
	}
	public static void main(String[] args) {
		 Nestedtry t = new   Nestedtry();
		t.case3();
	}
	}
