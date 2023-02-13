package prototypepatternexample.soln;

public class Circle implements Component{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Creating a circle");
    }

    @Override
    public Component clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle;
    }
}
