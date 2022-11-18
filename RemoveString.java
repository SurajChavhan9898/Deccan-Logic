package com.deccon.company;

public class RemoveString {
	public static String removeWord(String string, String word) {
		if (string.contains(word)) {
			String tempWord = word + " ";
			string = string.replaceAll(tempWord, "");

			tempWord = " " + word;
			string = string.replaceAll(tempWord, "");
		}
		return string;
	}

	public static void main(String args[]) {

		String string = "It is a long established fact that a reader is will be distracted \n " + 
				"the readable content of a page when looking at its layout. \n" + 
				"The point of using Lorem Ipsum is that it has a more-or-less normal\n" + 
				"distribution of letters, as opposed to using 'Content here, content here',\n" + 
				"making it look like readable English. Many desktop publishing packages and\n" + 
				"web page editors now use Lorem Ipsum as their default model text, \"\r\n" + 
				"and a search for 'lorem ipsum' will uncover many web sites still in their infancy.\n" + 
				"Various versions have evolved over the years, sometimes by accident, sometimes \n" + 
				"on purpose (injected humour and the like).";
		String word = "is";

		System.out.println("Removed String :   " + removeWord(string, word));

}
}
