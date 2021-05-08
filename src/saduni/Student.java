package saduni;

public class Student extends IdGenerator implements ShowDetails{
    protected String name;
    protected String address;
    protected char sex;
    protected int bornYear;
    protected String specialization;
    protected String studentID;
    protected int[] marks;

    public void addDetails(String name, String address, char sex, int bornYear, String specialization){
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
    }

    public String generateId(){
        this.studentID = generateId();
        return studentID;
    }

    //Create addMarks array and store marks
    public void addMarks(int m1, int m2, int m3, int m4, int m5){
        marks = new int[]{m1, m2, m3, m4, m5};
    }

    @Override
    public void showDetails() {
        System.out.println("Student name " + name);
        System.out.println("Student address " + address);
        System.out.println("Gender " + sex);
        System.out.println("Student year " + bornYear);
        System.out.println("Student specialization " + specialization);
    }
    
}


	
