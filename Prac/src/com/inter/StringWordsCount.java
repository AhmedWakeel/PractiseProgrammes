package com.inter;

public class StringWordsCount {

	public static void main(String[] args) {

		String str = "  Hi    Ahmed    How Are   you    and where are   live in India";
		// countWord(str);
//		CountWordByReplace(str);
	}

	private static void CountWordByReplace(String str) {
		System.out.println(str);
		String replaceAll = str.replaceAll(" ", "-");
		String[] split = replaceAll.split("-");
		System.out.println(split);
		int count = 0;
		int k;
		for (k = 0; k < split.length; k++) {
			if (!(split[k].contains("-"))) {
				System.out.println(split[k]);
				count++;
			}
		}
		System.out.println(count);
	}

	private static void countWord(String str) {

		String[] split = str.split("\\s+");
		int count = 0;
		int k;
		for (k = 0; k < split.length; k++) {
			if (split[k].contains("") && split[k].length() > 0) {
				System.out.println(split[k]);
				count++;
			}
		}

		System.out.println(count);
	}
}
