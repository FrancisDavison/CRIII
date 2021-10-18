import java.util.ArrayList;
public class Question_1
{
	public static void main(String args[])
	{
		ArrayList<Boolean> rep = new ArrayList<Boolean>();
		rep.add(true);
		rep.add(false);
		rep.add(true);
		rep.add(false);
		rep.add(true);
		rep.add(false);
		ArrayList<Double> weights = new ArrayList<Double>();
		weights.add(10.0);
		weights.add(150.0);
		weights.add(2.0);
		weights.add(1.0);
		weights.add(150.0);
		weights.add(29.0);
		ScalesFitness(rep, weights);
	}
	
	public static double ScalesFitness(ArrayList<Boolean> rep, ArrayList<Double> weights)
	{

		if (rep==null||weights==null) {
			return -100;
		} 
		
		if(rep.size()==0||weights.size()==0||rep.size()>weights.size())
		{
			return -100;
		}
			double lhs=0.0, rhs=0.0;
			int n=rep.size();

			for (int i=0;i<n;i++)
			{
				if (rep.get(i)==true)
				{
					lhs=lhs+weights.get(i);
				} 
				else
				{
					rhs=rhs+weights.get(i);
				}
			}
			return Math.abs(lhs-rhs);
	}
}