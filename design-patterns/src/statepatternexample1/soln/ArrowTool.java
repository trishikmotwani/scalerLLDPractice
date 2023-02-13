package statepatternexample1.soln;

public class ArrowTool implements Tool{
    @Override
    public void mouseDragged() {
        System.out.println("Arrow dragged");
    }

    @Override
    public void mouseUp() {
        System.out.println("Arrow drawn");
    }
}
