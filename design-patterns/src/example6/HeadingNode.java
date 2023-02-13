package example6;

public class HeadingNode implements HtmlNode{
    @Override
    public void validate() {
        System.out.println("Validation of heading done");
    }
}
