package saduni;
public class Weekday extends Student implements ShowDetails {
    public String freeDay;

	public void addDetails(String name, String address, char sex, int bornYear, String specialization, String freeDay) {
		
		super.addDetails(name, address, sex, bornYear, specialization);
		this.freeDay = freeDay;
	}
	
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Student Freeday " + freeDay);
    }

}