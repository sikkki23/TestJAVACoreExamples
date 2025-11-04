package test.com;

public class BClass extends Aclass{
	@Override
	public void M1(Integer i) throws ArithmeticException {
	 System.out.println("B class M1 Call");

	}
	
	public static void main(String[] ar) 
	{
		Aclass a = new BClass();
		a.M1(1);
	}
	
	

}
