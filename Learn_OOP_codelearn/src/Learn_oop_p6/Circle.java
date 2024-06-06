
package Learn_oop_p6;

public class Circle implements IShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }
    
}
