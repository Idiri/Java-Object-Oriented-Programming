import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteExample{
    public static void main(String[] args){

        String FilePath = "/Users/idirismuhu/test.txt";
        String textContent = """
                                I like ramen noodles!\n
                                my goal is to become the hokage\n
                                dattebayo!""";

        try(FileWriter writer = new FileWriter(FilePath)){
            writer.write(textContent);
            System.out.println("File has been written!");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}