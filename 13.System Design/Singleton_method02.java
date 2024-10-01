public class Singleton_method02 {
    private static Singleton_method02  object1 = new Singleton_method02();

    // 2. Eager  way of creating Singleton object 
    public static Singleton_method02 getdata(){
        return object1 ;
    }
}
