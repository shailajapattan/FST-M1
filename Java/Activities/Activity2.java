package Activities;

public class Activity2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numarr= {10,77,10,54,-11,10};
		int j=0;
		
		for(int i=0;i<6;i++)
		{
			if(numarr[i]==10) {
				
				j+=numarr[i];
		
			}
			
			
			}
		if(j==30) {
		System.out.println("The sum is 30");
		}
		else
			System.out.println("The sum is not 30");
	}
		
	}
	

