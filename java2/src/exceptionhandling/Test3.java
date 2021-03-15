package exceptionhandling;

public class Test3 {
		public static void main(String[] args) {
			try {
				String s ="hello";
				int i=Integer.parseInt(s);
			}
			catch(NumberFormatException e) {
				System.out.println(e);}
			System.out.println("Rest of the code");
			}
		}
