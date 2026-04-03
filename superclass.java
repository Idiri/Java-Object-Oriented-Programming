public class superclass{
    public static void main(String[] args){
        //super = Refers to the parent class (subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Potter");
        Student student = new Student("Tom", "Riddle", 4.0);
        Employee employee = new Employee("Rubeus",  "Hagrid", 50000);

        employee.showSalary();



    }
}