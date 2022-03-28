import java.util.Scanner;

public class OuickSort {

	public static void quickSort(int[] arr, int l , int h) {
		if(l<h) {
			int p = partition(arr,l,h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}
		
	}
	
	public static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		System.out.println("Pivot : "+pivot);
		
		int i=l ; int j=l;
		while(i<=h) {
			if(arr[i]<=pivot) {
				swap(arr,i,j);
				i++;
				j++;
			}else {
				i++;
			}
		}
		System.out.println("pivot index: "+(j-1));
		return (j-1);
		
		}
	
	public static void swap(int[] arr,int i,int j) {
		System.err.println("swap: "+arr[i]+" and "+arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[]= new int [n];
		System.out.println("Enter values of array");
		  for(int i = 0; i < n; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	   
		  quickSort(arr,0,n-1);
		  
		  System.out.println("Answer: ");
	   for( int i = 0; i<n; i++)
       {
		   
           System.out.print(arr[i]+" ");
       }


	}

}
