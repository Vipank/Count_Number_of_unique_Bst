import java.io.*;

public class countuniquebst{


	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());		
		int [] array=new int[n];
		array[0]=1;
		array[1]=2;
		array[2]=5;
		if(n==0){
			System.out.println(1)
		}
		else if(n==1){
			System.out.println(1);
		}else if(n==2){
			System.out.println(2);
		}else if(n==3){
			System.out.println(5);
		}
		else{
			
			for(int i=3;i<n;i++){
				int totalbst=0;
				for(int i1=0;i1<=i;i1++){
				
					int keys_to_the_left=i1;
					int keys_to_the_right=i-i1;
					if(keys_to_the_left-1 >=0 && keys_to_the_right-1 >=0){
					
					totalbst=totalbst+array[keys_to_the_left-1]*array[keys_to_the_right-1];
				
				}
				else if(keys_to_the_left -1 >=0){
					
					totalbst=totalbst+array[keys_to_the_left-1];
				}
				else if(keys_to_the_right -1 >=0){
					
					totalbst=totalbst+array[keys_to_the_right-1];
				}
				
			}
			array[i]=totalbst;
		}
			
			System.out.println(array[n-1]);
		}
	}
}