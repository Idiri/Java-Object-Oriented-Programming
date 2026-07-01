import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


public class TestFileClass {

  public static void main(String[] args) throws IOException{
      //File file = new File("image/java.gif"); // (Relativ filebane med filnavn)
      
      File file = new File("nyfil.txt"); // (filnavn)
      //FileNotFoundException kan brukes for fil
      // Men ikke FileInputStream-objekt, det krever "throws IOException" i signatur
    
      //FileInputStream er mer fleksibel enn File og lese data i små biter (chuncks)
      //FileInputStream fileInput = new FileInputStream(file);
      //System.out.println("One chunk has " + fileInput.read() + " bytes");
      //fileInput.close();

    
      System.out.println("Does it exist? " + file.exists());
      System.out.println("The file has " + file.length() + " bytes");

       
      System.out.println("Can it be read? " + file.canRead());
      System.out.println("Can it be written? " + file.canWrite());
      System.out.println("Is it a directory? " + file.isDirectory());
      
      System.out.println("Is it a file? " + file.isFile());
      System.out.println("Is it absolute? " + file.isAbsolute());
      System.out.println("Is it hidden? " + file.isHidden());
      System.out.println("Absolute path is " +
      file.getAbsolutePath());
      System.out.println("Last modified on " +
      new Date(file.lastModified()));
     
    //fileInput.close();
  }
}