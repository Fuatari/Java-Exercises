
public class nTwice {

	public static void main(String[] args) {
		nTwice input = new nTwice();
		System.out.println(input.NTwice("Release", 2));
	}

	public String NTwice(String stringInput, int intInput) {
		String outputStart = "";
		String outputEnd = "";
		String outputTwice = "";

		for (int i = 0; i < intInput; i++) {
			outputStart += stringInput.charAt(i);
			outputEnd += stringInput.charAt((stringInput.length() - intInput + i));
		}

		// System.out.println(stringInput + ", " + intInput + ":");
		outputTwice = stringInput + ", " + intInput + " --> " + outputStart + outputEnd;
		return outputTwice;
	}

}