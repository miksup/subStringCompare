
public class Running {

	public static void main(String[] args) {
		

		String message1 = "The reason I am alive";
		String message2 = "I am. The realest alive";
		
		int savedPosition = 0;
		int savedLength = 0;

		for (int i = 0; i < message1.length(); i++) {
			
			int length = 1;
			
			for (int j = 0; j < message2.length(); j++) {
				
				if(message1.substring(i, i+length).equals(message2.substring(j, j+length))) {
					
					if (savedLength < length) {
						
						savedLength = length;
						savedPosition = i;
						
					}
					
					j--;
					length++;
					
				}
				
			}
			
		}

		System.out.println(message1.substring(savedPosition, savedPosition+savedLength));
		
	}

}
		
