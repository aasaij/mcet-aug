import java.text.DecimalFormat;
public class ShapeTest {
    public static void main(String[] args) {
        // Shape circle = new Shape();
        // System.out.println(circle);
        DecimalFormat df = new DecimalFormat("##,##0.##");
        Shape shape = new Rectangle(10, 20);
        System.out.println("Rectangle Area : " + df.format(shape.findArea()));
        System.out.println("Rectangle Perimeter : "+df.format(shape.findPerimeter()));
        Shape3D shape1 = new Circle(10.5);
        System.out.println("Circle Area : " + df.format(shape1.findArea()));
        System.out.println("Circle Perimeter : "+df.format(shape1.findPerimeter()));
        System.out.println("Circle Volume : "+df.format(shape1.findVolume()));
        System.out.println("Circle Surface Area : "+df.format(shape1.findSurfaceArea()));
    }
}
