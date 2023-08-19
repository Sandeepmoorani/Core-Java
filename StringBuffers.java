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

        // 2. insert()
        sb.insert(0, "Mr. ");
        System.out.println(sb);

        // 3. replace()
        sb.replace(0, 4, "Mr. ");
        System.out.println(sb);

        // 4. delete()
        sb.delete(4, 11);
        System.out.println(sb);

        // 5. reverse()
        sb.reverse();
        System.out.println(sb);

        // 6. capacity()
        System.out.println(sb.capacity());

        // 7. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        // 8. charAt()
        System.out.println(sb.charAt(0));

        // 9. setCharAt()
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // 10. getChars()
        char ch[] = new char[10];
        sb.getChars(0, 7, ch, 0);
        System.out.println(ch);

        // 11. length()
        System.out.println(sb.length());

        // 12. substring()
        System.out.println(sb.substring(0, 7));

        // 13. subSequence()
        System.out.println(sb.subSequence(0, 7));
       

        // sb1.append("SM");
        // System.out.println(sb1);




        
        

    }
    
}
