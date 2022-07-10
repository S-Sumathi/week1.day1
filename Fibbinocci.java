package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To print fibbinocci for first 11 numbers
		
		//Declaring variables
		
		int firstNum=0,secNum=1,sum=0;
		
		//loop through
		for (int i = 1; i <=11 ; i++) {
			System.out.println(firstNum);	
			sum=firstNum +secNum;
					firstNum=secNum;
					secNum=sum;
							
					
		}
		
		}
		

	}


