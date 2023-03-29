package OCA_2022_Preparation_all_questions_main.java.q009.java_OCA_selfStudy._Questions;

public class Q22 {
	
	public static void main(String[] args) {
		int ans;
		try{
			int num = 10;
			int div = 0;
			ans = num/div;
		} catch(ArithmeticException ae) {
			ans = 0;
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
//		System.out.println("Answer= " + ans);
	}

}