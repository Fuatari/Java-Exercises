
public class DoubleChar {

	public static void main(String[] args) {
		DoubleChar duplicate = new DoubleChar();
		System.out.println(duplicate.doubleUp("Word"));
	}

	public String doubleUp(String input) {
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			temp += input.charAt(i);
			temp += input.charAt(i);
		}
		return temp;
	}

}