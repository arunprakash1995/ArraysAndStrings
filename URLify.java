	public static String urlify(String str, int tl){
		int count=0;
		for(int i=0;i<tl;++i){
			if(str.charAt(i)==' '){
				++count;
			}
		}
		int index = tl+(2*count);
		char[] s=str.toCharArray();
		if(tl<str.length()){
			s[tl]='\0';
		}
		for(int i=tl-1;i>=0;--i){
			if(str.charAt(i)==' '){
				s[--index]='0';
				s[--index]='2';
				s[--index]='%';
			}
			else{
				s[--index]=str.charAt(i);
			}
		}
		String result = new String(s);
		return result;
	}

	public static int findTrueLength(String str) {
		for(int i=str.length()-1;i>=0;--i) {
			if(str.charAt(i)!=' ') {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		String str = "he l   lo        ";
		int tl=findTrueLength(str);
		System.out.println("String : " + urlify(str,tl));

	}	