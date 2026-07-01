//package kap12;

public class TestCircleWithException {
    public static void main(String[] args){//TODO: Try refactor to using throws..
       
        try {
            CircleWithException circle1 = new CircleWithException(5);
            CircleWithException circle2 = new CircleWithException(-5);
            CircleWithException circle3 = new CircleWithException(-2);
        } 
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
            
        }
        /*
        CircleWithException circle4 = new CircleWithException();
        circle4.setRadius(10);
        //circle4.setRadius(-10);
        circle4.setRadiusHandlesNegative(-10);
        System.out.println(circle4.toString());
         */
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
        
    }
        
}