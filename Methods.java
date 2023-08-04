 class methods_In_Java{
    public void play(){
        System.out.println("something is running");
    }
    

    public int add(int num,int num1){
        int result = num +num1;
        return result;

    }

}
public class Methods {
    public static void main(String[] args) {
        methods_In_Java m = new methods_In_Java();
       System.out.println(m.add(5, 6));
       m.play();


        
    }
    
}
