package AccessMod;


import Accessmodifiers.Company;
public class HR extends Company{
	
	@Override
	public void table() {
		System.out.println("table---");
	}
	
	private void row() {
		System.out.println("row---");
	}
	@Override
	protected void colm() {
		System.out.println("colm---");
	}
	
    void address() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
