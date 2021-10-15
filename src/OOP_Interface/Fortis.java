package OOP_Interface;

public class Fortis extends Hospital implements USMedical,UKMedical, IndianMedical {
	
	

@Override
public void ClinicalService() {
	System.out.println("fh--ClinicalService");
	
}



@Override
public void OptometryService() {
	System.out.println("fh--OptometryService");
}



@Override
public void PodiatristService() {
	System.out.println("fh--PodiatristService");
	
}



@Override
public void DentalService() {
	System.out.println("fh--DentalService");
	
}



@Override
public void AudiologistService() {
	System.out.println("fh--AudiologistService");
}



@Override
public void CardiologyService() {
	System.out.println("fh--CardiologyService");
	
	
	
}



@Override
public void NaturopathService() {
	System.out.println("fh--NaturopathService");
}



@Override
public void PsychiatristService() {
	System.out.println("fh--NaturopathService");
	
}



@Override
public void ChiropractorService() {
	System.out.println("fh--NaturopathService");
}

public void GynocologyServices() {
	System.out.println("fh--GynocologyServices");
	
	
}

public void AnaestheticServices() {
	System.out.println("fh--AnaestheticServices");
	
	
}
@Override
public void pharmacy() {
	System.out.println("fh has it's own pharmacy");
	
}

public void Covid19Test() {
	System.out.println("Fh--covid test is mandatory");
}
}
