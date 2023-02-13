package statepatternexample1.soln;

public class RectangleTool implements Tool{
    @Override
    public void mouseDragged() {
        System.out.println("Rectangle dragged");
    }

    @Override
    public void mouseUp() {
        System.out.println("Rectangle drawn");
    }
}
