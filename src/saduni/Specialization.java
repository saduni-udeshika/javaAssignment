package saduni;

/*The system stores the Degree Specialization details including the specialization (e.g
IT,SE,DS,CSN,IM) and the GPA criteria as key value pairs.
Creation of Speacialization class and store above key value pairs and print.*/

import java.util.HashMap;

public class Specialization {
	private HashMap<Double, String> Specialization = new HashMap<>();
	
	public void addSpecialization(String specialization, double GPA) {
		Specialization.put(GPA, specialization);
		
	}

	public void displayenrolledStudents() {
		Specialization.forEach((k,v) ->{
				System.out.println(k + " : "+ v);
			});
	}
}
