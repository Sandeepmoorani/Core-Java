public class Strings {
    public static void main(String[] args) {
        // two ways to create a string in java // 1. String literal
		
       /*  String name1=new String("Sandeep");
        System.out.println(name1);

        String name2="Sandeep";
        System.out.println(name2); */



        String st[] = new String[5];
        st[0]="Sandeep";
        st[1]="qurban";
        st[2]="zahoor";
        st[3]="sandeep";
        st[4]="qurban";

        // for(String n : st){
        //     System.out.println(n);
        // }

        for(int i=0; i<st.length; i++){
            System.out.println(st[i]);
        }

        st[0]= st[0].concat("Moorani");
        System.out.println(st[0]);

        // st[0]=st[0].concat("Moorani");
        // System.out.println(st[0]);





    


        
    }
    
}
