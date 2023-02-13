package statepatternexample1;

import prototypepatternexample.soln.Component;
import statepatternexample1.soln.Tool;

public class Canvas {

    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void mouseDragged() {
        currentTool.mouseDragged();
//        if(currentTool == ToolType.ARROW)
//            System.out.println("Arrow dragged");
//        else if(currentTool == ToolType.RECTANGLE)
//            System.out.println("Rectangle dragged");
//        else if(currentTool == ToolType.OVAL)
//            System.out.println("Oval dragged");

    }
    public void mouseUp() {
        currentTool.mouseUp();
//        if(currentTool == ToolType.ARROW)
//            System.out.println("Draw new Arrow");
//        else if(currentTool == ToolType.RECTANGLE)
//            System.out.println("Draw new Rectangle");
//        else if(currentTool == ToolType.OVAL)
//            System.out.println("Draw new Oval");
    }
}
