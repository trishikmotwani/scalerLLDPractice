package example6.soln;

public class ValidtionOperation implements Operation{
    @Override
    public void apply(AnchorNode node) {
        System.out.println("Anchor node validated");
    }

    @Override
    public void apply(HeadingNode node) {
        System.out.println("Heading node validated");
    }
}
