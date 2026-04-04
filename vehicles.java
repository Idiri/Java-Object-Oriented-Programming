public class vehicles{

    private String type;


    public vehicles(String type){
        this.type = type;
    }

    public void drive(){
        System.out.println("The " + type + " is driving.");
    }

    public String getType(){ return type; }

}