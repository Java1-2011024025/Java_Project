package Sample_0328;

public class aray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<=9;i++){
			System.out.println(ar[i]);
		}
       int[] ar2 = new int[10];
       for(int j=0; j<=9; j++){
    	  ar2[j]=j+1;
       System.out.println(ar[j]);
       }
       
       for(int x: ar2){
    	   System.out.println(x);
             
    	   }
       
       
       
	}

}
