package com.deccon.company;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		int strLen, wordLen, i, temp, j, k = 0;
		String str1 = "It is a long established fact that a reader is will be distracted \n "
				+ "the readable content of a page when looking at its layout. \n"
				+ "The point of using Lorem Ipsum is that it has a more-or-less normal\n"
				+ "distribution of letters, as opposed to using 'Content here, content here',\n"
				+ "making it look like readable English. Many desktop publishing packages and\n"
				+ "web page editors now use Lorem Ipsum as their default model text, \"\r\n"
				+ "and a search for 'lorem ipsum' will uncover many web sites still in their infancy.\n"
				+ "Various versions have evolved over the years, sometimes by accident, sometimes \n"
				+ "on purpose (injected humour and the like).";
		
		String str2 = "is";

		strLen = str1.length();
		wordLen = str2.length();

		char[] strChars = new char[strLen];
		char[] wordChars = new char[wordLen];

		strChars = str1.toCharArray();
		wordChars = str2.toCharArray();
		for (i = 0; i < strLen; i++) {
			temp = i;
			for (j = 0; j < wordLen; j++) {
				if (strChars[i] == wordChars[j])
					i++;
			}
			k = i - temp;
			if (k == wordLen) {
				for (j = temp; j < (strLen - wordLen); j++)
					strChars[j] = strChars[j + wordLen];
				strLen = strLen - wordLen;
			}
		}
		System.out.print("\nThe new string is: ");
		for (i = 0; i < strLen; i++)
			System.out.print(strChars[i]);
	}
}
