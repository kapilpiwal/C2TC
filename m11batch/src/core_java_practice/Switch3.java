package core_java_practice;

public class Switch3 {

	public static void main(String[] args) 
	{
		// switch case in java (String)
	
		String name = "te";
		switch(name.toLowerCase())
		{
		case "author": System.out.println("Kapil"); break;
		case "team": System.out.println("team java full stack"); break;
		case "editor": System.out.println("Hitesh & Krishna"); break;
		default: System.out.println("Invalid Entry");
		}

	}

}
