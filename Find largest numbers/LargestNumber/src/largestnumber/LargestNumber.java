 
package largestnumber;

 
public class LargestNumber {

 
    public static void main(String[] args) {
        // TODO code application logic here
       int x=507, y=77, z=5000;
		if (x>y){
			if (x>z){
				System.out.println("x is greater");
			}
			else{
				if(z>y){
					System.out.println("z is greater"); 
				}
				else{
					System.out.println("y is greater");
				}
			}
		}
		else{
			if (y>z){
				System.out.println("y is greater");
			}
		}
	}
}
