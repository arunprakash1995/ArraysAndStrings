class MatrixRotation{

	int[][] m ;
	int size;

	public MatrixRotation(int s){
		size =s;
		m = new int[size][size];
		int temp=0;
		for(int i=0;i<size;++i){
			for(int j=0;j<size;++j){
				m[i][j] = temp;
				temp++;
			}
		}
	}
	boolean rotateMatrix(){
		if(m.length<0 || m.length != m[0].length)
			return false;

		for(int k=0;k<m.length/2;++k){
			int first = k;
			int last = m.length-k-1;

			for(int i=k;i<m[0].length;++i){
				int offset= i-k;
				int temp = m[first][i];
				m[first][i] = m[last-offset][first];
				m[last-offset][first] = m[last][last-offset];
				m[last][last-offset] = m[i][last];
				m[i][last] = temp;
			}
		}
	return true;
	}

	boolean displayMatrix(){
		for(int i=0;i<size;++i){
			System.out.println();
			for(int j=0;j<size;++j){
				System.out.print(m[i][j]+ " ");
			}
		}
	}

	public static void main(String[] args){
		int s=5;
		MatrixRotation mr = new MatrixRotation(s);
		System.out.println("Original Matrix");
		mr.displayMatrix();
		if(mr.rotateMatrix()){
			System.out.println("Rotated Matrix");
			mr.displayMatrix();
		}
	}
}