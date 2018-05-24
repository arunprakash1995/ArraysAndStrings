package ANSPackage;

public class ZeroMatrix {
	
	public static void setZeros(int[][] mat){
		if(mat.length<=0 || mat[0].length<=0) return ;
		boolean rowHasZeroes = false ;
		boolean colHasZeroes = false ;

		for(int i=0;i<mat[0].length;++i){
			if(mat[0][i]==0)rowHasZeroes=true;
		}
		for(int j=0;j<mat.length;++j){
			if(mat[j][0]==0)colHasZeroes=true;
		}

		for(int i=1;i<mat.length;++i){
			for(int j=1;j<mat[0].length;++j){
				if(mat[i][j]==0){
					mat[i][0]=0;
					mat[0][j]=0;
				}
			}
		}


		for(int i=1;i<mat[0].length;++i){
			if(mat[0][i]==0){
				nullifyCol(i,mat);
			}
		}

		for(int i=1;i<mat.length;++i){
			if(mat[i][0]==0){
				nullifyRow(i,mat);
			}
		}

		if(rowHasZeroes){
			nullifyRow(0,mat);
		}
		if(colHasZeroes){
			nullifyCol(0,mat);
		}
	}



	public static void nullifyRow(int r,int[][] mat){
		for(int i=0;i<mat[0].length;++i){
			mat[r][i]=0;
		}
	}

	public static void nullifyCol(int c,int[][] mat){
		for(int i=0;i<mat.length;++i){
			mat[i][c]=0;
		}
	}

	public static void printMat(int[][] mat){
		System.out.println("\n");
		for(int i=1;i<mat.length;++i){
			System.out.println();
			for(int j=1;j<mat[0].length;++j){
				System.out.print(mat[i][j] + " ");
			}
		}
	}
	
	public static void main(String[] args){
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = new int[nrows][ncols];	
		for(int i=0;i<nrows;++i) {
			for(int j=0;j<ncols;++j) {
				if((i+j)%17==0) {
					matrix[i][j]=0;
				}
				else {
					matrix[i][j]=i+j;
				}
			}
		}
		printMat(matrix);	
		setZeros(matrix);
		printMat(matrix);
	}
}
