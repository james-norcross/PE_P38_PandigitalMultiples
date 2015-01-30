package projecteuler.problem38;

public class PandigitalMultiples {

	/**
	 * Author: James Norcross
	 * Date: 1/30/15
	 * Purpose: Project Euler Problem 38
	 * Description: Finds the largest pandigital multiple
	 */
	public static void main(String[] args) {
		
		String greatestPandigital = "";
		
		for (int multiplicand = 1; multiplicand < 9999; multiplicand++)
		{
			String result = "";
			int multiplier = 1;
			
			while(result.length() < 9)
			{
				result += Integer.toString(multiplicand * multiplier);
				multiplier++;
			}
			
			if (isPandigital(result) && (result.compareTo(greatestPandigital) > 1))
			{
				greatestPandigital = result;
			}
		}
		
		System.out.println("The greatest pandigital multiple is "  + greatestPandigital);
	}
	
	private static boolean isPandigital(String s)
	{
		return ( s.length() == 9
				&& (s.indexOf('1') != -1)
				&& (s.indexOf('2') != -1)
				&& (s.indexOf('3') != -1)
				&& (s.indexOf('4') != -1)
				&& (s.indexOf('5') != -1)
				&& (s.indexOf('6') != -1)
				&& (s.indexOf('7') != -1)
				&& (s.indexOf('8') != -1)
				&& (s.indexOf('9') != -1)
				);
	}

}
