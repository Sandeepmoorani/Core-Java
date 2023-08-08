class SingletonC {

    private static SingletonC single_instance = null;
    public String a;

    private SingletonC() {
        a = "Hello I am a string part of Singleton class";
    }

    public static synchronized SingletonC getInstance() {
        if (single_instance == null)
            single_instance = new SingletonC();
        return single_instance;
    }

    public String getString() {
        return a;
    }
}

public class MainClass {
    public static void main(String args[]) {
        SingletonC x = SingletonC.getInstance();
        System.out.println("x:" + x.getString());
        SingletonC y = SingletonC.getInstance();
        System.out.println("y:" + y.getString());
        
       
    }
}
