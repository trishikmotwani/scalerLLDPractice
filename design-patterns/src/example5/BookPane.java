package example5;

import java.util.HashMap;
import java.util.Map;

public class BookPane {

    private Map<String, Ebook> eBooks = new HashMap<>();

    public void add(Ebook ebook) {
        eBooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        eBooks.get(fileName).show();
    }
}
