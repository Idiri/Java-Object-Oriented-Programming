public class Rad{
    private int[] rad;

    public Rad(int[] rad){
        this.rad = rad;
    }
    public int getVerdi(int kol){
        return rad[kol]; 
    }
    public void setVerdi(int kol, int verdi){
        rad[kol] = verdi;
    }
}