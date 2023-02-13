package example5;

public class Main {
    public static void main(String[] args) {
    	BookPane bookPane = new BookPane();
        String[] bookNames = {"Effective Java", "The Life of Pi", "Sapiens"};
        for(String bookName: bookNames)
            bookPane.add(new Ebook(bookName));

        bookPane.openEbook("Effective Java");
    }
}
