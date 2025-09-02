public class Point3DTest {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(10,5,7);
        Point3D p2 =new Point3D();
        p2.setX(10);
        p2.setY(20);
        p2.setZ(30);
        System.out.println(p1);
        System.out.println(p2);
    }
}
