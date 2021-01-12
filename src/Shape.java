public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(java.lang.String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.lang.String toString() {
        return "Shape{" +
                "color=" + getColor() +
                " and " + (isFilled() ? "filled": "not filled") +
                '}';
    }
}
