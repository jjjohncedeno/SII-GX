
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
	
	public void mayor(){
	    if (num1>num2)
	        System.out.println(num1 + " es mayor que " + num2);
	      else
	        System.out.println(num2 + " es mayor que " + num1);
	}
}
