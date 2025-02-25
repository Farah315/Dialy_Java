/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;

/**
 *
 * @author Al-Qema
 *///فرح خليل حسن طبل
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
   
    public Employee(String n , int i ,String d , String p){
    name=n;
    idNumber=i;
    department=d;
    position=p;
    }
    public Employee(String n , int i){
    name=n;
    idNumber=i;
    department="";
    position="";
    }
    public Employee(){
    name="";
    idNumber=0;
    department="";
    position="";
    }
    public void setName(String n){
    name=n;
    }
    public String getName(){
        return name;
    }
    public void setDepartment(String d){
    department=d;
    }
    public String getDepartment(){
        return department;
    }
    public void setPosition(String p){
    position=p;
    }
    public String getPosition(){
        return position;
    }
    public void setIdNumber(int i){
    idNumber=i;
    }
    public int getIdNumber(){
        return idNumber;
    }
    
}
   

