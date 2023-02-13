package example6;

public class AnchorNode implements HtmlNode{
    @Override
    public void validate() {
        System.out.println("Anchor node validated");
    }
}
