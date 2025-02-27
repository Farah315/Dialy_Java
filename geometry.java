/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometryapp;
 

/**
 *
 * @author Al-Qema
 */
public class geometry {
// 2320230929فرح خليل حسن طبل
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
         // 2320230929فرح خليل حسن طبل

    }
}
 

