package eksamensøving.sesh5;

import java.util.Scanner;

public class EksamenV2024Oppgave3 {
}
class SokeFunksjoner{
    private Institutt institutt;
    private int funksjonsvalg = -1;
    private String studentnavn;
    private String emnekode;
    private String bokstavkarakter;

    SokeFunksjoner(Institutt institutt, int funksjonsvalg, String studentnavn, String emnekode, String bokstavkarakter){
        this.institutt = institutt;
        this.funksjonsvalg = funksjonsvalg;
        this.studentnavn = studentnavn;
        this.emnekode = emnekode;
        this.bokstavkarakter = bokstavkarakter;
    }
    public void finnStudent(String studentnavn){
        for(Student s : institutt.getStudentListe()){
            if(s.getNavn().equalsIgnoreCase(studentnavn)){
                System.out.println(s.toString());
            }
        }
    }
    public void finnAlleStudenterMedKarakter(String emnekode, String bokstavkarakter){
        for(Emne e : institutt.getEmneListe()){
            if(e.getEmnekode().equalsIgnoreCase(emnekode)){
                for(Karakter K : e.getKarakter()){
                    if(k.getBokstavKarakter().equalsIgnoreCase(karakter)){
                        System.out.println(k.getStudent().toString());
                    }
                }
            }
        }
    }
    public void finnEmneKarakter(String studentnavn, String emnekode){
        for(Emne e : institutt.getEmneListe()){
            if(e.getEmnekode().equalsIgnoreCase(emnekode)){
                for(Karakter k : e.getKarakterer()){
                    if(k.getStudent().getNavn().equalsIgnoreCase(studentnavn)){
                        System.out.println("Student: " + studentnavn + ", Karakter: " + k.getBokstavKarakter());
                    }
                }
            }
        }
        System.out.println("Fant ikke karakter for student i valgt emne.");
    }
}
class StudentAdministrasjonSystem{
    public static void main(String[] args) {
        Institutt institutt = new Institutt("Vestfold IT", "Bakkenteigen");
        Scanner input = new Scanner(System.in);
        int valg = -1;
        System.out.println("Velkommen til hovedmenyen");
        try{valg = input.nextInt();
        if(valg < 0 || valg > 4) {
            throw new FeilInntastingUnntak("Du har tastet feil, velg et tall mellom 0-4");
        }
        }catch(FeilInntastingUnntak e){
            System.out.println(e.getMessage());
        }
        while(valg != 0){
            System.out.println("Du kan velge følgende:");
            System.out.println("1. Skriv ut alle emner");
            System.out.println("2. Søk etter en student med navn");
            System.out.println("3. Finn alle studenter i et emne med en karakter (A,B,C,D,E,F)");
            System.out.println("4. Finn karakter til en student i et emne");
            System.out.println("0. for å avslutte");

            valg = input.nextInt();
            input.nextLine();

            if(valg != 0){
                Thread t = new Thread(() -> sokeFunksjonVelger(institutt, valg));
                t.start();
            }
        }
        input.close();
    }
    public static void sokeFunksjonVelger(Institutt institutt, int funksjonsvalg){
        SokeFunksjoner soke = new SokeFunksjoner((institutt, funksjonsvalg, null,  null, null));

        switch(funksjonsvalg){
            case 1:
                institutt.skrivUtAlleEmner();
                break;
            case 2:
                System.out.println("Skriv inn studentnavn:");
                soke.finnStudent("Navn");
                break;
            case 3:
                soke.finnAlleStudenterMedKarakter("KODE", "A");
                break;
            default:
                System.out.println("Ugyldig valg");
        }
    }
}
class FeilInntastingUnntak extends Exception{
    public FeilInntastingUnntak(String melding){
        super(melding);
    }
}
