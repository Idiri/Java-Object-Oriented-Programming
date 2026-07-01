package eksamensøving.sesh2;

import java.util.ArrayList;

public class Firma {
    private String firmaNavn;
    private int antallKunderPrivat;
    private int antallKunderBedrift;
    private ArrayList<PrivatKunde> privatKunder;
    private ArrayList<BedriftsKunde> bedriftsKunder;

    public Firma(String firmaNavn, int antallKunderPrivat, int antallKunderBedrift){
        this.firmaNavn = firmaNavn;
        this.antallKunderPrivat = antallKunderPrivat;
        this.antallKunderBedrift = antallKunderBedrift;
        this.privatKunder = new ArrayList<>();
        this.bedriftsKunder = new ArrayList<>();
    }
    public String hentFirmaNavn(){
        return firmaNavn;
    }
}
