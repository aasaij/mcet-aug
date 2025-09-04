public class Circle extends Shape3D{
    private double radius;
    //constructor
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double findVolume() {
        return 4.0/3.0 * radius * findArea();        
    }
    @Override
    public double findSurfaceArea() {
        return 4 * findArea();
        
    }
    @Override
    public double findArea() {
        return Math.PI * radius * radius;
        
    }
    @Override
    public double findPerimeter() {
        return 2 * Math.PI * radius;        
    }    
}
