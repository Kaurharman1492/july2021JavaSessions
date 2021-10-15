package Accessmodifiers;

public class Employee extends Company {
	
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

	@Override
	void address() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.name="ibm";
		e.address();

	}

}
