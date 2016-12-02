
public class Operaciones {
	private int num1;
	private int num2;
	public Operaciones(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma(){
		return this.num1 + this.num2;
	}
	
	public double division(){
		return this.num1/this.num2;
	}
}
