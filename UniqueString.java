class UniqueString{
	String str;

	UniqueString(String s){
		str = s;
	}

	public boolean checkUnique(){
		Set<Character> c = new HashSet<Character>();
		for(char C:str.toCharArray()){
			if(c.contains(C)){
				return false;
			}
			c.add(C);
		}
		return true;
	}

	public static void main(String[] args){
		Scanner in;
		if(args.length>0){
			in = new Scanner(args[0]);
		}
		else{
			in = new Scanner(System.in);
		}
		String s = in.next();
		UniqueString str = new UniqueString(s);
		System.out.println("Is the String Unique ? " + str.checkUnique());
	}
}