package round2_exeterpremedia;

//import java.awt.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FiletoString1 {

    public static void main(String[] args) {

        String path = "D:\\Kaviya\\exeter\\t8.shakespeare.txt";

        try {

            
        	List content = (List) Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}