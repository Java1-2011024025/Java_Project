package example_0404;

public class televison {
	int channel;
	int volume;
	boolean onOff;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		televison tv = new televison();
		tv.channel = 7;
		tv.volume = 10;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은" + tv.channel + "이고 볼륨은"+ tv.volume + "입니다.");
	
	}

}
