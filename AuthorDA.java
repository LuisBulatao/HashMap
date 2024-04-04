import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorMap;
    
    public AuthorDA() throws FileNotFoundException {
        Scanner AuthorInfo = new Scanner(new FileReader("C:\\Users\\Luis Joshua\\OOPActivities\\LabSeatwork5\\src\\Author.csv"));

        authorMap = new HashMap<>();

        while (AuthorInfo.hasNext()) {
            String authorInfo = AuthorInfo.nextLine();
            String[] ArrayAuthorInfo = new String[2];
            ArrayAuthorInfo = authorInfo.split(",");


            String name = ArrayAuthorInfo[0].trim();
            String bio = ArrayAuthorInfo[1].trim();
            authorMap.put(name, new Author(name, bio));

        }
    }
    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
   }
}
