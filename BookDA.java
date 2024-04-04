import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
public class BookDA {
    private HashMap<String, Book> bookMap;
    private HashMap<String, Author> authorMap;

    public BookDA(HashMap<String, Author> authorMap) {
        this.authorMap = authorMap;
    }

    public HashMap<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(HashMap<String, Book> bookMap){
        this.bookMap = bookMap;
    }



    public HashMap<String, Book> book1() throws IOException{
        Scanner bookAuthorInfo = new Scanner(new FileReader("C:\\Users\\Luis Joshua\\OOPActivities\\LabSeatwork5\\src\\Book.csv"));

        bookMap = new HashMap<>();

        while(bookAuthorInfo.hasNext()) {
            String rowBookInfo = bookAuthorInfo.nextLine();
            String[] ArrayBookInfo = new String[3];
            ArrayBookInfo = rowBookInfo.split(",");

            String isbn = ArrayBookInfo[0].trim();
            String title = ArrayBookInfo[1].trim();
            String authorName = ArrayBookInfo[2].trim();


            Author author1 = authorMap.get(authorName);
                if (author1 == null) {
                    author1 = new Author(authorName, "");
                }

            Book book1 = new Book(isbn, title, author1);
            bookMap.put(isbn,book1);

        }
        bookAuthorInfo.close();
        return bookMap;
    }
}
