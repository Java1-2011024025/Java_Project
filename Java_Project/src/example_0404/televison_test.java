package example_0404;

public class televison_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		televison myTv = new televison();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		televison yourTv = new televison();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은" + myTv.volume + "입니다." );
		System.out.println("나의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은" + yourTv.volume + "입니다." );
		

	}

}
