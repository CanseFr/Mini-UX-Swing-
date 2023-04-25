 
package evennumbers;

 
import java.io.*;
public class EvenNumbers {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br1.readLine());
		System.out.println("Even Numbers:");
		for (int i=1;i <=num ; i++){
		         if(i%2==0 ){
					System.out.print(i+",");
				}
			}
		}
		catch(Exception e){}
        
    }
    
}
