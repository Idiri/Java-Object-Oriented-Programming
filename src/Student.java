public class Student extends Person{
    
    private double gpa;

    public Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;

    }

    public void showGPA(){
        System.out.println(getFirst() + "'s gpa is: " + this.gpa);
    }

    public double getGpa(){ return gpa; }
}