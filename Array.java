public class Array {
    public static void main(String[] args) {
        

        // int arr[]= {9,8,7,6};

        // you also change the vale like 

        // arr[1] = 2;

        // System.out.println(arr[3]);

        // another way of creating an array 

        // int arr[] = new int[5];

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;

        // for ( int i=0; i<5; i++){
        //     System.out.println(arr[i]);
        // }


        int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}


        
    }
    
}


// Drawbacks:-
// - The memory allocation is contiguous.
// - The size of an array is fixed. Array size cannot be expand.
// - Searching takes time.
// - Array can store values of only same type. It can store homogeneous type value only.
