import java.io.*;
import java.util.*;
 
public class baek_2751 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
 
		Arrays.sort(A);
		
		for(int i = 0; i< N; i++) {
			sb.append(A[i]).append('\n');
		}
		System.out.println(sb);
	}
}