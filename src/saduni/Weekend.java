package saduni;

//Inherit student class properties

public class Weekend extends Student implements ShowDetails {
	//Declatation of weekend students's speacial attribute
    public String jobTitle;
   
	public void addDetails(String name, String address, char sex, int bornYear, String specialization, String jobTitle) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.jobTitle = jobTitle;
		
	}

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Student job title " + jobTitle);
    }

}
