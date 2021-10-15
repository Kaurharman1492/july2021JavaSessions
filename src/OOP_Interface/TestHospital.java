package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fortis fh=new Fortis();
		
		fh.AnaestheticServices();
		fh.AudiologistService();
		fh.DentalService();
		fh.GynocologyServices();
		fh.PsychiatristService();
		fh.pharmacy();
		fh.Covid19Test();
		
		UNHG.PandemicUpdate();
		

	}

}
