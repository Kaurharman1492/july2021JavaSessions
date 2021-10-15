package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="chrome";
 switch (browser) {
case "chrome":
	System.out.println("chrome launch");
	
	String version="90";
	switch (version) {
	case "90":
		System.out.println("launch chrome 90");
		
		break;
		
		case "80":
		System.out.println("launch chrome 80");
		
		break;

	default:
		break;
	}
	
	break;
	

case "firefox":
	System.out.println("firefox launch");
	
	break;
case "safari":
	System.out.println("safari launch");
	
	break;
	
case "ig":
	System.out.println("ig launch");
	
	break;
	

default:
	break;
}
	String env="dev";
	
	switch(env.toUpperCase()) {
	
	case "QA":
		System.out.println("url : " + "http://www.qa.abc.com");
		System.out.println("qa:qa");
		
		break;
	case "DEV":
		System.out.println("url : " + "http://www.dev.abc.com");
		System.out.println("dev:dev");
		
		break;
		
	case "STAGE":
		System.out.println("url : " + "http://www.stage.abc.com");
		System.out.println("stage:stage");		
		break;
		
	case "PROD":
		System.out.println("url : " + "http://www..abc.com");
		System.out.println("admin:admin");		
		break;
		
		

	default:
		
		System.out.println("please pass the right env name...." +env);
		break;
	
	}
	
	int amount=120;
	switch (amount) {
	case 90:
		
		System.out.println("hello");
		
		break;
   case 80:
		
		System.out.println("how r u ");
		
		break;
   case 150:
		
		System.out.println("smile");
		
		break;
	default:
		
		System.out.println("bye");
		break;
	}
	
	}

}


