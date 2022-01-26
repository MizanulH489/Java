

public class TestGeometricObject {
  /** Main method */

 /**two methods: main method and sumArea method*/
 // show two methods to use
  // main method

  public static void main(String[] args) {
   //Create Array
    GeometricObject[] array_a = new GeometricObject[4]; // new geometric object array four objects
    // Create New circle
    array_a[0] = new Circle(5); // create array of object new circle with radius 5
    array_a[1] = new Circle(6); // create array of new object new circle with radius 6
    // Create New Rectangle objeects initialized, with height and width initailized
    array_a[2] = new Rectangle(2,3);
    array_a[3] = new Rectangle(2,3);

    //Call method Sumarrea from first array
    sumArea(array_a);


  }

  /// sumarea method
  public static void sumArea(GeometricObject[] array_a) {
      // double variables of the cicle and rectangle object
    double circleArea = 0;
    double rectangleArea =0;

    for(GeometricObject o:array_a){
      if(o instanceof Circle){
        circleArea+= o.getArea();
      }
      else if(o instanceof Rectangle){
        rectangleArea+=o.getArea();
        Rectangle r = (Rectangle) o;

      }
    }

    //sorting change

    //Print out results
    System.out.println("The total area for Circle is: "+circleArea);
    System.out.println("The total area for Rectangle is: "+rectangleArea);
    System.out.println("Before sorting - radius of each circle object: ");
    System.out.println("After sorting - radius of each circle object: ");
  }

}
