public class Point {
    //States
    protected int x, y;
    //Constructor
    public Point(){
        x = 0;
        y = 0;
        System.out.println("Base class default constructor");
    }
    //constructor overloading
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Base class parameterized constructor");
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
        System.out.println("Base class copy constructor");
    }
    //Getters
    public int getX(){
        return x;        
    }
    public int getY(){
        return y;
    }
    //Setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return x + "," + y;
    }
}
