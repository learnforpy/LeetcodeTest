package easy.find_Anagram_Mappings_760;

public class TestString {

	public static void main(String[] args) {
//		int[] A = {12, 28, 46, 32, 50};
//		int[] B = {50, 12, 32, 46, 28};
		int[] A = {84,46};
		int[] B = {84,46};
		int P [] = new int[2];
		for( int i = 0 ; i < A.length; i ++){
			for( int j = 0  ; j < B.length ; j ++){
				if (A[i] == B[j]){
					P[i] = j;
					System.out.println("i: " +i);
					System.out.println("j: "+ j);
				}
			}
			
		}
		
		for(int k : P){
			System.out.println(k);
		}
		

	}

}
