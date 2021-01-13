package round2_exeterpremedia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TranslationOfWords {

	public static void main(String[] args) throws IOException {
		String path="D:\\Kaviya\\exeter\\t8.shakespeare.txt";
		//String passage=Files.readString(Paths.get(path));
    	List paragraph = (List) Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

		
		
		String FindWordspath="D:\\Kaviya\\exeter\\find_words.txt";
		//String wordsList=Files.readString(Paths.get(FindWordspath));
    	List<String> listofwords = (List) Files.readAllLines(Paths.get(FindWordspath), StandardCharsets.UTF_8);

		List<String> findWordsList = new ArrayList<String>(Arrays.asList(listofwords.split("\\r?\\n")));

		String csvpath="D:\\Kaviya\\exeter\\french_dictionary.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvpath));
	    String line =  null;
	    HashMap<String,String> map = new HashMap<String, String>();
	    
	    while((line=br.readLine())!=null){
	        	String str[] = line.split(",", 2);
	            map.put(str[0], line.substring(str[0].length()+1));
	    }
		   

	    String temp="";
	   for(int i=0;i<((CharSequence) paragraph).length();i++) {
		   int tempInt=i;
		   while(((CharSequence) paragraph).charAt(i)!=' ') {
			   temp+=((CharSequence) paragraph).charAt(i);
			   i++;
		   }
		   if(findWordsList.contains(temp)) {
			  String paragraph1=paragraph1.replace(paragraph1.substring(tempInt,i),map.get(temp));
			   temp="";
		   }
	   }

	   System.out.print("paragraph:");
	   System.out.print(paragraph);
	}

}
