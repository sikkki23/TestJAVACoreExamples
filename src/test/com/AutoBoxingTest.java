package test.com;

public class AutoBoxingTest {

	public static void main(String[] args) {
		
		Aclass a = new BClass();
		
		a.M1(new Integer(10) );
		
		a.M1(9);
		
		BClass b = new BClass();
		
		b.M1(new Integer(10) );
		
		b.M1(10);

	}

}
