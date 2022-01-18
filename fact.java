public class fact{
	public static void main(String[] args){
		int fact = 1;
		for(int x = 5; x > 0; x--)
		{
			fact= fact*x;
		}
		System.out.println(fact);
	}
}