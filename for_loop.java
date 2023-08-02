public class for_loop {
    public static void main(String[] args) {
        
        // for (int i=1; i<=12; i++)
        // System.out.println("Month" + " " + i);


        // for(int i=1;i<=7;i++)
		// {
		// 	System.out.println("Day"+i);
		// 	for(int j=1;j<=9;j++)
		// 	{
		// 		System.out.println(" "+(j+8)+"-"+(j+9));
		// 	}
		// }


        for(int x=1; x<=12; x++){
            System.out.println("Month" + x);
            for(int y=1; y<=5; y++){
                System.out.println(" "+(y+6) + "----"+ (y+7));
            }
        }
       
    }
    
}
