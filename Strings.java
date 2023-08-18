public class Strings {
    public static void main(String[] args) {
        // two ways to create a string in java // 1. String literal

        /*
         * String name1=new String("Sandeep");
         * System.out.println(name1);
         * 
         * String name2="Sandeep";
         * System.out.println(name2);
         */

        String st[] = new String[5];
        st[0] = "Sandeep";
        // st[1]="qurban";
        // st[2]="zahoor";
        // st[3]="sandeep";
        // st[4]="qurban";

        // for(String n : st){
        // System.out.println(n);
        // }

        // for(int i=0; i<st.length; i++){
        // System.out.println(st[i]);
        // }

        // st[0]= st[0].concat("Moorani");
        // System.out.println(st[0]);

        // st[0]=st[0].concat("Moorani");
        // System.out.println(st[0]);

        // String methods

        

        System.out.println(st[0].length());

        

        System.out.println(st[0].charAt(0));

      

        System.out.println(st[0].concat("Moorani"));

       

        System.out.println(st[0].equals(st[1]));

      

        System.out.println(st[0].equalsIgnoreCase(st[3]) + "M5" );

      

        System.out.println(st[0].replace('S', 'Z'));


        System.out.println(st[0].substring(0, 3));

       

        System.out.println(st[0].toLowerCase());

       

        System.out.println(st[0].toUpperCase());

        // 10. trim() method

        String name=" Sandeep ";

        System.out.println(name.trim());

        // 11. valueOf() method

        int a = 10;

        String s = String.valueOf(a);

        System.out.println(s + 10);

        // 12. split() method

        // String name="Sandeep Moorani";

        // String st[]=name.split(" ");

        // for(String n : st){

        // System.out.println(n);
        // }

        // 13. startsWith() method

        System.out.println(st[0].startsWith("S"));

        // 14. endsWith() method

        System.out.println(st[0].endsWith("p"));

        // 15. indexOf() method

        System.out.println(st[0].indexOf("e"));

        // 16. lastIndexOf() method

        System.out.println(st[0].lastIndexOf("e"));

        // 17. isEmpty() method

        System.out.println(st[0].isEmpty());

        // 18. compareTo() method

        // System.out.println(st[0].compareTo(st[1]));

        // 19. compareToIgnoreCase() method

        // System.out.println(st[0].compareToIgnoreCase(st[3]));

        // 20. contains() method

        System.out.println(st[0].contains("S"));

        // 21. contentEquals() method

        System.out.println(st[0].contentEquals("Sandeep"));

        // 22. copyValueOf() method

        char ch[] = { 'S', 'a', 'n', 'd', 'e', 'e', 'p' };

        String sr = String.copyValueOf(ch);

        System.out.println(sr);

    }

}
