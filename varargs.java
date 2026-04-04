
public class varargs{
    public static void main(String[] args){
        System.out.println(average(1,2,3,4,5,6));
    }

    static double average(double... numbers){
        double sum = 0;
        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
