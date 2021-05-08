package saduni;
import java.util.Random;
/*creatation of IdGenerator class and generate auto generate studentID no*/
public class IdGenerator {
	String id;
    protected String generateID(){
    	Random rand = new Random();
		int int_random = rand.nextInt(9999);
		//Add "IT" as prefix to auto generated random number 
		id = " IT" +  int_random; 
		
		//If the student ID does not contain at least four digits including the prefix catch error and print message
		if (int_random < 1000) {
			int_random += 1000;
			try {
				throw new IDInvalidException(" ID invalid! Regenerate ID");
			}
			catch(IDInvalidException e){
				System.out.println(e.getMessage());
			}
			return null;
		}
		else {
		    return id;  
		}
 	
    }
}
