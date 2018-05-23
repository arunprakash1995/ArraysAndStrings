public class StringComparator {
	public static boolean oneEditAway(String m,String n){
		if(Math.abs(m.length()-n.length())>1){
			return false;
		}
		boolean found = false;
		String longer = m.length()>n.length()?m:n;
		String shorter = m.length()<n.length()?m:n;
		for(int i=0,j=0;i<longer.length()-1 && j<shorter.length()-1;){
			if(longer.charAt(i)!=shorter.charAt(j)){
				if(found){
					if(n.length()==m.length() || i!=j){
						return false;
					}

				}
				else{
					found = true;
					if(n.length()==m.length()){
						++j;
					}
				}
				++i;
			}
			else{
				++i;
				++j;
			}
		}
		return true;
	}

	public static void main(String[] agrs) {
		String m="pale";
		String n="bae";
		System.out.println(m+" & "+n+ " is one Edit away ? " + oneEditAway(m,n));
		m="apple";
		n="aple";
		System.out.println(m+" & "+n+ "is one Edit away ? " + oneEditAway(m,n));
	}
}