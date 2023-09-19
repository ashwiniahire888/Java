abstract class Shape

{

 double d1,d2;

 Shape(double d1,double d2)

 {

  this.d1=d1;
 
  this.d2=d2;

 }

 abstract double calc_area();

 abstract double calc_volume();

}

class Sphere extends Shape

{

 Sphere(double d1)

 {
 
  super(d1,0);

 }

 double calc_area()

 {

  return(4*3.14*d1*d1);

 }

 double calc_volume()

 {

  return(4.0/3.0*3.14*d1*d1*d1);

 }

}

class Cone extends Shape

{

 Cone(double d1,double d2)
 
{

  super(d1,d2);

 }

 double calc_area()

 {

  return(3.14*d1*(d1+d2));

 }

 double calc_volume()

 {

  return(3.14*d1*d1*d2/3.0);

 }

}

class Cylinder extends Shape

{

 Cylinder(double d1,double d2)

 {

  super(d1,d2);

 }

 double calc_area()

 {

  return(2*3.14*d1*d2);

 }

 double calc_volume()

 {

  return(3.14*d1*d1*d2);

 }

}

class ShapeDemo

{

 public static void main(String args[])

 {

  Shape S=new Sphere(6.0);
  
System.out.println("Area is:" +S.calc_aera());

  System.out.println("Volume is:" +S.calc_volume());

  S=new Cone(7.0,9.0);

  System.out.println("Area is:" +S.calc_aera());

  System.out.println("Volume is:" +S.calc_volume());

  S=new Cylinder(7.2,8.2);

  System.out.println("Area is:" +S.calc_aera());

  System.out.println("Volume is:" +S.calc_volume());
   
 }

}

