package easy;

import java.util.BitSet;

public class Palindrome_Permutation {
	public static void main(String[] args){
		
		boolean result = canPermutePalindrome("test" );
		System.out.println(result);
	}

	private static boolean canPermutePalindrome(String s) {
		BitSet bs = new BitSet();
		    for (byte b : s.getBytes())
		        bs.flip(b);
		    return bs.cardinality() < 2;
				
				
	}
	
}
