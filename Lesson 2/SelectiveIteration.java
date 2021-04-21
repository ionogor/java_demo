public class SelectiveIteration
{
	public static void main(String[] args) {
		
		int num=10;
		

		while(num>0)
		{
			num--;
			if(num%3==0 && num+=5%7==0 )
			{

				continue;
			}
			System.out.println(num);
			
		}
	}
}