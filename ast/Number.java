package ast;
import environment.Environment;

/**
 * Number class is used to interpret numbers
 * @author Arnav Dani
 * @version 3/22/22
 */
public class Number extends Expression 
{
	private int val;
	
	/**
	 * Constructor for number class
	 * @param v the number
	 */
	public Number(int v)
	{
		val = v;
	}
	
	/**
	 * Evaluates a number object by returning the number
	 * @return integer of the number
	 */
	@Override
	public int eval(Environment env) 
	{
		return val;
	}

}
