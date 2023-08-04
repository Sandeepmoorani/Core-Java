class calc{
    public int add(int x1,int x2){
        int result = x1+x2;
        return result;
    }
}
public class classobj {
    public static void main(String[] args) {

        calc cl = new calc();

       System.out.println(cl.add(3, 4));
        
    }
    
}
