package homewark.homewark02;

public class UnSupportedException extends RuntimeException{
	public UnSupportedException() {
		throw new UnSupportedException("원인을 알 수 없는 오류가 발생했습니다.");
	}

	public UnSupportedException(String message) {
		super(message);
	}
	
	
	
}
