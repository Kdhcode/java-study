package sec01.exam06;

public class Television implements RemoteControl{
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Television를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Television 볼륨: " + this.volume);
			
	}
}
