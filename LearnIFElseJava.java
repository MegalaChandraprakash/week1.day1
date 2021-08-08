package week1.day1;

public class LearnIFElseJava {
	public static void main(String[] args) {
		int number = 1;
		if (number == 0) {
			System.out.println("The number is neutral");
		}
		else if(number%2!=0)
			System.out.println("the number is odd");
		else
			System.out.println("the number is even");
	}
}