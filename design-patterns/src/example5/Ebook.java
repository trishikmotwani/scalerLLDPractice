package example5;

public class Ebook {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    private String contents;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading a book: " + fileName);
    }

    public void show() {
        System.out.println("Showing the book: "+ fileName);
    }
}
