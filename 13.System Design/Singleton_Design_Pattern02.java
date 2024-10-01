public class Singleton_Design_Pattern02 {

   private static Singleton_Design_Pattern02 obj1 ;

     //  Constructor used to create object 
     private Singleton_Design_Pattern02() {

     }  

// 1. Lazy way of creating Singleton object 
// Synchronized  method used to avoid multithrading     
public static  Singleton_Design_Pattern02 getobject(){

    synchronized(Singleton_Design_Pattern02.class){ //  One thread at a time 
    if(obj1==null){ // will execute only first time      
    Singleton_Design_Pattern02  obj1 = new Singleton_Design_Pattern02();
    }
}

    return obj1 ;
}

}