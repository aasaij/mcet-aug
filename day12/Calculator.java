public class Calculator{
    public int add(int x, int y){
        return x + y;
    }
    //Method overloading
    public int add(int x, int y, int z){
        return x + y + z;
    }
    public float add(float x, float y){
        return x + y;
    }
    // public double add(double x, double y){
    //     return x + y;
    // }
    public int subtract(int x, int y){
        return x - y;
    }
    public int multiply(int x, int y){
        return x * y;
    }
    public double divide(int x, int y){
        if ( y != 0)
            return (double)x / y;
        return -1;
    }
    public double power(int x, int y){
        return Math.pow(x,y);
    }
    public double power(double x, double y){
        return Math.pow(x,y);
    }
}