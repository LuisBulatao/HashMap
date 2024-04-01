import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.module.FindException;
import java.util.HashMap;
import java.util.*;
public class BookDA {
    private HashMap<String, Book> bookMap;
    public HashMap<String, Book> getBookMap(){
     return bookMap;
    }

    public BookDA() throws FileNotFoundException{
        Scanner bookAuthorInfo = new Scanner(new FileReader("Book.csv"));

        bookMap = new HashMap<>();

        while(bookAuthorInfo.hasNext()) {
            String rowBookInfo = bookAuthorInfo.nextLine();
            String[] ArrayBookInfo = new String[3];
            ArrayBookInfo = rowBookInfo.split(",");

            Book book1 = new Book();

            book1.setIsbn(ArrayBookInfo[0].trim());
            book1.setTitle(ArrayBookInfo[1].trim());
            book1.setAuthorName(ArrayBookInfo[2].trim());

            bookMap.put(book1.getIsbn(), book1);
        }
        bookAuthorInfo.close();
    }
}
