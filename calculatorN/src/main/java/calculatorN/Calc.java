package calculatorN;

public class Calc {

	private int result = 0;
	public void add(int x, int y){
		result = x + y;
	}
	public void sub(int x, int y){
		result = x - y;
	}
	public void mul(int x, int y){
		result = x * y;
	}
	public void div(int x, int y){
		if(y!=0) // y∞° 0¿Ã∏È
			result = x/y;
	}
	public void inc(int x){
			result +=x;
	}
	public int getResult(){
		return result;
	}
}