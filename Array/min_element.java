import java.util.Scanner;

public class min_element {

	public static void main(String[] args) {
		
//		inputs 
		
		int arr[]= new int [20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter values of array");
		  for(int i = 0; i < n; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	   System.out.println("Values are");
	   for( int i = 0; i <n; i++)
       {
           System.out.print(arr[i]+" ");
           System.out.println(); 
       }
	   
/*	Method 1 */
		
		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum arry element is : "+min); 


/*	Method 2
		 
		int min = arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]<min) {
				min = Math.min(min, arr[i]);
			}
		}
		System.out.println("Minimum arry element is : ");
		System.out.println(min);  */
		
/*	Method 3
		 
		Arrays.sort(arr);
		System.out.println("Minimum arry element is : ");
		System.out.println(arr[n]);
		 */
		
//		Method 4 using recurrsion

	}

}

