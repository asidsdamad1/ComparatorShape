public class Circle extends Shape {
    private float radius;

    public Circle(String color, boolean filled, float radius) {
        super(color, filled);
        this.radius = radius;
    }
    public  Circle(float radius) {
        this.radius = radius;
    }
    public Circle() {

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
