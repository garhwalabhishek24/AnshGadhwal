package InterfaceOperation;

public class ColourTest implements ColourInterface {

	@Override
	public void orange() {
		System.out.println("orange");
		
	}

	@Override
	public void black() {
		System.out.println("black");
		
	}

	@Override
	public void red() {
		System.out.println("red");
		
	}

	@Override
	public void white() {
	System.out.println("white");
		
	}
	public static void main(String[] args) {
		ColourInterface c = new ColourTest();
	    c.black();
	    c.white();
	    c.red();
	    c.orange();
	    
	}
	
	
	
	

}
