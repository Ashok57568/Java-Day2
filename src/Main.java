
 class Cylinder{
    public double radius,height;

    public double lidArea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius ;
    }

    public double totalSurfaceArea(){
        return lidArea();
    }
    public double volume(){
        return Math.PI*radius*radius*height ;
    }
 }

  public class Main{
      public static void main(String[] args) {
          Cylinder c = new Cylinder();
          c.radius=12;
          c.height=13;
          System.out.println();
      }
  }
