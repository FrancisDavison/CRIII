import java.util.Random;
public class Question_2
{
	public static void main(String args[])
	{
		int n=10;
		RandomBinaryString(n);
	}
	
	public static String RandomBinaryString(int n)
	{
		String Random_Binary = "";
		if(n<=0)
		{
			return Random_Binary;
		}
		Random rand = new Random();
		for(int i=0;i<n;i++)
		{
			int r = rand.nextInt(2);
			Random_Binary+=r;
		}
		return Random_Binary;
	}
}