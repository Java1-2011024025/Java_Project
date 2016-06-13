package test;

public class test2 {
	int channel;
	int volume;
	boolean onOff;
	
	void print(){
		System.out.println(channel+volume);
		
	}
	
	int getChannel()
	{
		return channel;
	}
	
	void setChannel(int ch)
	{
	channel = ch;
	}
	
}
 