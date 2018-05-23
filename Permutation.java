public class Permutation {
	/*Function to check if a string is permutaion of a palindrome  (case sensitive "Tat" != "taT")
	"Tact Coa" is a permutaion of palindrome "Tacocat
	HashMap is Used for storing the character frequency table
	 */

	public static boolean checkPalindromePerm(String s){
		int countOdd=0;
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		for (char c:s.toCharArray()){
			if(c==' '){
				continue;
			}
			int ct = mp.getOrDefault(c,0);
			ct = ct+1;
			mp.put(c,ct);
			if(ct%2!=0){
				countOdd++;
			}
			else{
				countOdd--;
			}
		}
		if(countOdd>1){
			return false;
		}
		return true;
	}

	/*Function to check if a string is permutaion of a palindrome  (case insensitive ie 'TAt'=='taT')
	"Tact Coa" is a permutaion of palindrome "Tacocat"
	Array is Used for storing the character frequency table
	 */
	public static boolean chkPalindromePerm(String s){
		int[] array = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		Arrays.fill(array,0);
		int countOdd=0;
		for(char c:s.toCharArray()){
			int index = Character.getNumericValue(c)-Character.getNumericValue('a');
			if(index>=array.length || index<0){
				continue;
			}
			++array[index];
			if(array[index]%2==0){
				countOdd--;
			}
			else{
				countOdd++;
			}
		}
		if(countOdd>1){
			return false;
		}
		return true;
	}

	public static void main(String[] agrs){
		String str = "Tact coaoje";
		System.out.println('\"'+ str + '\"'+ " is case sensitive permutation of palindrome ? " + checkPalindromePerm(str));
		System.out.println('\"'+str+'\"' + " is case insensitive permutation of Palindrome ? " + chkPalindromePerm(str));
		str = "Tact coa";
		System.out.println('\"'+str+'\"' + " is case sensitive permutation of Palindrome ? " + checkPalindromePerm(str));
		System.out.println('\"'+str+'\"' + " is case insensitive permutation of Palindrome ? " + chkPalindromePerm(str));
		str = "tact coa";
		System.out.println('\"'+str+'\"' + " is case sensitive permutation of Palindrome ? " + checkPalindromePerm(str));
		System.out.println('\"'+str+'\"' + " is case insensitive permutation of Palindrome ? " + chkPalindromePerm(str));
	}
}