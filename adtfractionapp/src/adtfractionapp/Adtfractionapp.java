/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtfractionapp;

/**
 *
 * @author 174004m
 */
public class Adtfractionapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ADTFraction a1=new ADTFraction();
        a1.display();
        a1.set(7, 9);
        a1.display();
    
        float x=a1.value();
        System.out.println(x);
            //a1.plus(2,9);
        //a1.display();
        ADTFraction a2=new ADTFraction(2,3);
        a1.plus(a2);
        ADTFraction a3=a1.plus(a2);
        a3.display();
        
        a3 = a1.reciprocal();
        a3.display();
        
       ADTFraction a4=new ADTFraction(3,4);
       a1.times(a4);
       ADTFraction a5=a1.times(a4);
       a4.times(a5);
       a4.display();
            
    }
    
}

class ADTFraction{

private int n; //numerator
 private int d; //denomenator
 
 public ADTFraction(){
 this.n=0;
 this.d=1;
 }
 //---------------------------------------------------

public ADTFraction(int a,int b){  //default constructor
//fill the body
this(); //calling the default values--> constructor chain -(1)
if(b!=0){
this.n=a;
this.d=b;
}else{
System.out.println("Denominator cannot be 0");
//therefore assign default values -instead of (1) can use this too
//this.n=0;
 //this.d=1; 
}
 }
 //---------------------------------------------------
/* public ADTFraction (int a, int b) {//parameter constructor
//fill the body
this();
if(b!=0){
this.n=a;
this.d=b;
}else{
System.out.println("Denominator cannot be 0");

 }*/
 //---------------------------------------------------
 public void set (int a, int b){//set numerator and denomenator
//fill the body
if(b!=0){
this.n=a;
this.d=b;
}else{
System.out.println("Denominator cannot be 0");
}
 }
 //---------------------------------------------------
 public ADTFraction plus (ADTFraction x){ 
//add two fractions
//fill the body
ADTFraction ans=new ADTFraction();
ans.n=x.d*this.n+this.d*x.n;
ans.d=this.d*x.d;
return ans;

//return new ADTFraction(x.d*this.n+this.d*x.n,this.d*x.d);
 }
 //---------------------------------------------------
 public ADTFraction times (int a){//multiply fraction by a number
//fill the body
return new ADTFraction(this.n*a,this.d);
 }
 //---------------------------------------------------
 public ADTFraction times (ADTFraction x){//multiply two fractions //same funtion but parameters defferent=method over loading
//fill the body
return new ADTFraction(this.n*x.n,this.d*x.d);
 }
 //---------------------------------------------------
 public ADTFraction reciprocal (){//reciprocal of a fraction
//fill the body
return new ADTFraction(this.d,this.n);

 }
 //---------------------------------------------------
 public float value (){//numerical value of a fraction
//fill the body
float ans=(float)this.n/this.d;
return ans;


 }
 //---------------------------------------------------
 public void display (){//display the fraction in the format n/d
//fill the body
System.out.println("Fraction="+this.n+"/"+this.d);
 }
 //---------------------------------------------------
}
