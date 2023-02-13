package prototypepatternexample.soln;

public class Rectangle implements Component {
    @Override
    public void render() {
        System.out.println("Creating a rectangle");
    }

    @Override
    public Component clone() {
    	return new Rectangle();
    }
}
