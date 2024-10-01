public class Test03 {
        public static void main(String[] args) {

    //    Singleton_Design_Pattern02 obj1 =   Singleton_Design_Pattern02.getobject();
    //    System.out.println(obj1.hashCode());

    //    Singleton_Design_Pattern02 obj2 =   Singleton_Design_Pattern02.getobject();
    //    System.out.println(obj2.hashCode());

    Singleton_method02 object1 = new Singleton_method02().getdata();
            System.out.println(object1.hashCode());

    Singleton_method02 object2 = new Singleton_method02().getdata();
            System.out.println(object2.hashCode());


    }
}