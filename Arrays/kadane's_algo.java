import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr= new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = sc.nextInt();
		int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp =  sum + arr[i];
            sum = (temp > arr[i]) ? temp : arr[i];
            ans = (ans < sum) ? sum : ans;
        }
        System.out.println(ans);
	}
}
