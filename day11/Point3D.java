//3D Point
//Point -> base class, super class, parent class
//Point3D -> sub class, child class
public class Point3D extends Point{
    protected int z;
    //Constructor
    public Point3D(){
        super(); //will call base class default constructor
        this.z = 0;
    }
    public Point3D(int x, int y, int z){
        super(x,y); // will call base class parameterized constructor
        this.z = z;
    }
    //Getters
    public int getZ(){
        return z;
    }
    //Setters
    public void setZ(int z){
        this.z = z;
    }
    public String toString(){
        return super.toString() +"," + z;
    }    
}
