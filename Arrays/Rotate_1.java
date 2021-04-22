import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr= new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = sc.nextInt();
		int temp = arr[arr.length-1];
        int temp2 = arr[0];
        for(int  i = 0; i < arr.length - 1; i++){
            int temp3 = arr[i+1];
            arr[i+1] = temp2;
            temp2 = temp3;
        }
        arr[0] = temp;
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
	}
}
