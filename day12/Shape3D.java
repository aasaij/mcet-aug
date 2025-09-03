abstract public class Shape3D extends Shape{
        abstract public double findVolume();
        abstract public double findSurfaceArea();
        //Method overriding
        public void show(){
            System.out.println("This is 3D Shape");
        }
}
