public class Employee extends Person{
    
    private int salary;

    public Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    public void showSalary(){
        System.out.println(getFirst() + "'s salary is $" + this.salary);
    }

    public int getSalary(){ return salary; }
}