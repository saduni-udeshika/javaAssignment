/* author : Dilshani M.G.S.U
 * IT No: IT20491994
 * Batch No: Y2S1 13.2 
 */
package saduni;
public class Main {

	//Implementation of main method
	public static void main(String[] args) {
		
		Weekend student1 = new Weekend();
		student1.addDetails("Jane","Malabe",'F',19,"DS","QA");
		String studentid = student1.generateID();
		student1.addMarks(56, 34, 12, 46, 78);
		student1.showDetails();
		System.out.println("Student ID"+studentid);
		System.out.println();

		Weekday student2 = new Weekday();
		student2.addDetails("Jim", "Kaluthara", 'M', 1991, "SE", "Tuesday");
		String studentid2 = student2.generateID();
		student2.addMarks(78, 89, 45, 87, 90);
		student2.showDetails();
		System.out.println("Student ID"+ studentid2);
		
		Enroll sem1 = new Enroll();
		sem1.enrollStudent(studentid, "IT");
		sem1.enrollStudent(studentid2, "SE");
		System.out.println("\n\nEnrooded student details");
		sem1.displayenrolledStudents();
		
		Specialization spe = new Specialization();
		spe.addSpecialization("SE", 2.75);
		spe.addSpecialization("DS", 3.5);
	}

}

