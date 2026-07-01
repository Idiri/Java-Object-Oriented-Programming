package exams.session1;

public abstract class Dyr {

    private String navn;
    private int alder;

    Dyr(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }
    String getNavn(){
        return this.navn;
    }
    int getAlder(){
        return this.alder;
    }
    public abstract String lagLyd();
}
