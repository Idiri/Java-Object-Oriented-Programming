public class Car extends vehicles{

    private String model;
    private String color;
    private int year;
    private double price;

    public Car(String model, String color, int year, double price){
        super("car");
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;


    }

    public String getModel(){ return model; }
    public String getColor(){ return color; }
    public int getYear(){ return year; }
    public double getPrice(){ return price; }

}