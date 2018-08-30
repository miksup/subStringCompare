
public class Runner {

	public static void main(String[] args) {

		String message1 = "The ragged perpendicularly people";
		String message2 = "The person perpendicularly ragged";
		
		String[] forMess1 = message1.split(" ");
		String[] forMess2 = message2.split(" ");


		int holdLen = 0;
		String theLongest = "";
		
		for (String s : forMess1) {
			
			for (String s2 : forMess2) {
				
				if ((s.equals(s2)) && (s.length() > holdLen)) {
					
					holdLen = s.length();
					theLongest = s;
					
				}
				
			}
		
		}
		
		System.out.println(theLongest);
			
	}

}
