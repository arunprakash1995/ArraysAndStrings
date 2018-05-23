public class StringCompressor {
	public static String compressString(String s){
		StringBuilder str = new StringBuilder();
		char[] m = s.toCharArray();
		int count = 0;
		for(int i=0;i<m.length;++i){
			count++;
			if((i+1)>=m.length || m[i]!=m[i+1]){
				str.append(""+m[i]+Integer.toString(count));
				count=0;
			}
		}
		return str.length()>s.length()?s:str.toString();	
	}

	public static void main(String[] args){
		String s = "aaaabbvvvccc";
		System.out.println("Compressed String : "+ compressString(s));
	}
}