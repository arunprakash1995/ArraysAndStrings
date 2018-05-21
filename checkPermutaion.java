class Permutaion{
	
		public static boolean checkPermutation(String a, String b){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		if(a.length() != b.length()){
			return false;
		}
		for(Character c:a.toCharArray()){
			if(map.containsKey(c)){
				int count = map.get(c);
				map.put(c,count+1);
			}
			else{
				map.put(c,1);
			}
		}
		for(Character c:b.toCharArray()){
			int count = map.getOrDefault(c,0);
			count = count-1;
			if(count<0){
				return false;
			}
			map.put(c,count);
			}
		return true;
	}
	
	public static void main(String[] args) {
		String a  = "hello";
		String b = "eollhasfas";
		System.out.println(a + " & " + b  + " : " + checkPermutation(a, b));
	}
}