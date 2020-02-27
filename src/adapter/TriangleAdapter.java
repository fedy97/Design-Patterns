package adapter;
/*TriangleAdapter is implementing RectInterface.
So, it needs to implement all the methods defined
in the target interface.*/

/**
 * we want to calculate the area of a triangle using RectInterface,
 * and in order to do that we create an adapter that implements RectInterface
 * and there we return the area of a triangle, the program does not notice
 * it is a triangle instead of a rectangle
 */
public class TriangleAdapter implements RectInterface{
    Triangle triangle;
    public TriangleAdapter(Triangle t)
    {
        this.triangle = t;
    }
    @Override
    public void aboutRectangle() {
        triangle.aboutTriangle();
    }
    @Override
    public double calculateAreaOfRectangle() {
        return triangle.calculateAreaOfTriangle();
    }
}
