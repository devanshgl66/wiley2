package DSAQuestions;

import java.util.Arrays;

public class StringRepeation {
	static Boolean dp[];

	static boolean calc(String s, String wordDict[], String orginalString) {
		if (s.length() == 0)
			return true;
		if (dp[orginalString.length() - s.length()] != null) {
			System.out.println(s);
			return dp[orginalString.length() - s.length()];
		}
//		System.out.println(s);
		for (String str : wordDict) {
			if (s.startsWith(str)) {
				String n = s.substring(str.length());
//				System.out.println(s+" "+n);
				boolean b = calc(n, wordDict, orginalString);
				if (b == true) {					
					dp[orginalString.length() - s.length()]=true;
					return true;
				}
			}
		}
		dp[orginalString.length() - s.length()]=false;
		return false;
	}

	public static void main(String[] args) {
//		String s="aaaab";
//		String wordDict[]= {"aa","a","ab"};
//		String s="leetcode";
//		String wordDict[]= {"leet","code"};
//		String s="applepenapple";
//		String wordDict[]= {"pen","apple"};
		String s="catsandog";
		String wordDict[]= {"cats","dog","sand","and","cat"};
//		String s = "WordbreakproblemilikeAlphaViktorsamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithice";
//		String Dict = "this, th, is, famous, Word, break, b, r, e, a, k, br, bre, brea, ak, problem, Alpha, Beta, Delta, Gamma, Sigma, Viktor, Vajt, Adios, Test, Line, Word1, Word2, i, like, sam, sung, with, samsung, mobile, ice, cream, icecream, man, go, mango, and";
//		String[] wordDict = Dict.split(", ");
		dp = new Boolean[s.length() + 1];
		boolean b = calc(s, wordDict, s);
		System.out.println(b);
//		System.out.println(Arrays.toString("abc".split("")));
	}
}
