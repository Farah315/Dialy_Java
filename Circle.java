/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farah;
//فرح خليل حسن طبل
public class Circle {
 private double radius;
  private final double PI=3.14159;
  
  public Circle(double r){
     radius=r; 
  }
  public Circle(){
     radius=0.0; 
  }
  public void setRadius(double r){
      radius=r;
  }
  public double getRadius(){
      return radius;
  }
  public double getArea (){
      double area=PI*radius*radius;
      return area;
  }
    public double getDiameter (){
    
      return radius*2;
  }
     public double getCircumference (){
    
      return 2*PI*radius;
  }
}
  
