package Sample_0328;

public class apt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9; i>=1 ; i--){
			for(int j=1; j<=8 ; j++){
				System.out.print(100*i+j+" ");
			if(i>=6 && j==5) break;
			}
			System.out.println(" ");
		}

	}

}
