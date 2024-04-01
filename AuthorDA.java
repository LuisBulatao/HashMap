import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorMap;
    public  HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }
    public AuthorDA() throws FileNotFoundException{
        Scanner AuthorInfo = new Scanner(new FileReader("Author.csv"));

        authorMap = new HashMap<>();

        while (AuthorInfo.hasNext()) {
            String authorInfo = AuthorInfo.nextLine();
            String[] ArrayAuthorInfo = new String[2];
            ArrayAuthorInfo = authorInfo.split(",");

            Author author1 = new Author();

            author1.setBio(ArrayAuthorInfo[0].trim());
            author1.setName(ArrayAuthorInfo[1].trim());


            authorMap.put(author1.getBio(), author1);
        }
        AuthorInfo.close();
    }
}
