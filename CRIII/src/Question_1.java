import java.util.ArrayList;

public class Question_1
{
	public static void main(String args[])
	{
		ArrayList<Boolean> rep = new ArrayList<Boolean>();
		rep.add(true);
		ArrayList<Double> weights = new ArrayList<Double>();
		weights.add(15.0);
		ScalesFitness(rep, weights);
	}
	
	public static double ScalesFitness(ArrayList<Boolean> rep, ArrayList<Double> weights)
	{
		double out = -100;
		if(rep == null)
		{
			return out;
		}
		if(weights == null)
		{
			return out;
		}
		if(rep.size()==0||weights.size()==0)
		{
			return out;
		}
		if(rep.size()>weights.size())
		{
			return -out;
		}
	}
}