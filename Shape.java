public abstract class Shape{
    
    
    public abstract double area(); // this is an abstract method, it does not have a body and must be implemented by subclasses

    public void display(){ // CONCRETE METHOD
        System.out.println("This is a shape");
    }
}

