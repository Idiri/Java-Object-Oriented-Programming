public class Person{

    private String first;
    private String last;

    public Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void showName(){
        System.out.println(this.first + " " + this.last);
    }

    public String getFirst(){ return first; }
    public String getLast(){ return last; }
}