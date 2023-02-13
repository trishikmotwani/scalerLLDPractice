package example6.soln;

public class AnchorNode implements HtmlNode {
//    @Override
//    public void validate() {
//        System.out.println("Anchor node validated");
//    }

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
