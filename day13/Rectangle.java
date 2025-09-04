public class Rectangle extends Shape{
    private double length;
    private double width;
    //Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    //Overriding
    @Override
    public double findArea(){
        return length * width;
    }
    public double findPerimeter(){
        return 2 * (length + width);
    }
}
