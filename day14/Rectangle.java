public class Rectangle implements Shape{
    private double radius;

    public Rectangle(double r){
        this.radius = r;
    }
    @Override
    public double findArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }    
}
