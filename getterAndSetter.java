public class getterAndSetter{
    public static void main(String[] args){
     Car car = new Car("Hellcat", "Hazel", 100000);

     car.setColor("blue"); 

     car.setPrice(-5000); 

     System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());





    }
}