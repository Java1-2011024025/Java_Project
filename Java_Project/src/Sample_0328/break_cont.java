package Sample_0328;

public class break_cont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=4; i++){
			System.out.println("before:"+i);
			if(i==4) continue;
			System.out.println("after:"+i);
			System.out.println("***************************************");
			if(i==5) break;
		
		}

	}

}
