package exams.session1;

public class Løve extends Dyr{
    int manstørrelse;
    public Løve(String navn, int alder, int manstørrelse){
        super(navn, alder);
        this.manstørrelse = manstørrelse;
    }
    @Override
    public String lagLyd(){
        return "ROAR!";
    }
}
