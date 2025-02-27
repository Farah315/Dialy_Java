
package geometryapp;

public class geometry {

    public static void getArea(int r){
        if(r<0){
            System.out.println("error index");
            return;
            }
     
        System.out.println("The Area is : " + Math.PI * Math.pow(r, 2)); 
        
    
    }
    public static void getArea(int l , int w){
        if(l<0 || w <0){
            System.out.println("error index");
          return;
        }
     
        System.out.println("The Area is : " + l*w);   
        
    }
    
  public static void getArea(double b , int h){
      if(b<0 || h<0){
          System.out.println("error index");
          return;
      }
    System.out.println("The Arre is : " +b*h*0.5);


    }
}
 

