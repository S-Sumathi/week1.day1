package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To print prime number
		int num=13, reminder=0;
		
		for (int i = 2; i <=num-1; i++) {
			if (num%i==0) {
				
					System.out.println("Th number is not prime");
				reminder=1;
					break;
				}
			
				
			} 
			if(reminder==0) {
System.out.println("The number is  prime");
			}
		}
		
		}


