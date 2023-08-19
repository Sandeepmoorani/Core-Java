public class StringBuffers {
    public static void main(String[] args) {

        // what is string buffer?
        // String buffer is a class in java which is used to create mutable strings
        // mutable means changeable
        
        // what is difference between string and string buffer?
        // string is immutable and string buffer is mutable

        // how to create string buffer?
        // there are two ways to create string buffer
        // 1. using string buffer class
        // 2. using string builder class

        // 1. using string buffer class
        StringBuffer sb = new StringBuffer("Sandeep");
        System.out.println(sb);

        // 2. using string builder class

        StringBuilder sb1 = new StringBuilder("Sandeep");
        System.out.println(sb1);

        // string buffer methods

        // 1. append()
        sb.append("Moorani");
        System.out.println(sb);




        
        

    }
    
}
