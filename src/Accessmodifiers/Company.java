package Accessmodifiers;

public class Company {
	
	public String name;
	protected String HQ;
	private int SharePrice;
	String address;
	
	
	
	public void table() {
		System.out.println("table---");
	}
	
	private void row() {
		System.out.println("row---");
	}
	
	protected void colm() {
		System.out.println("colm---");
	}
	
    void address() {
		
	}

	public static void main(String[] args) {
		
		Company c=new Company();
		c.SharePrice=200;
		c.name="nokia";
		// TODO Auto-generated method stub

	}

}
