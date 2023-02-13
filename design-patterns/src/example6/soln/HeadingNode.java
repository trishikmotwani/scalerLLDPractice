package example6.soln;

public class HeadingNode implements HtmlNode {
//    @Override
//    public void validate() {
//        System.out.println("Validation of heading done");
//    }

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
