package homewark.homewark03;

public class CharCheckException extends RuntimeException{
	public CharCheckException() {
		throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
	}
	public CharCheckException(String msg) {
		super();
	}
	
}
