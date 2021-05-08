package saduni;

/* When a student wants to enroll, the student id and the specialization will be stored as a key value pair.
 * And this process does not require any order so that use Hashmap collection. 
 * "dispalyEnrolledStudents" will display the semester enrolled student details. 
 */
import java.util.HashMap;

public class Enroll {
	HashMap<String, String> enrolledStudents = new HashMap<>();

	public void enrollStudent(String studentid, String specialization) {
		enrolledStudents.put(studentid, specialization);
	}

	public void displayenrolledStudents() {
			enrolledStudents.forEach((k,v) ->{
				System.out.println(k + " : "+ v);
			});
	}
}