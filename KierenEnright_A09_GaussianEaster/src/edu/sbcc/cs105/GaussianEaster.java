package edu.sbcc.cs105;

/**
 * This class computes the month and day of Easter given the year. The only
 * instance variables allowed are m (the month) and d (the day).
 *
 */
public class GaussianEaster {
	private int m;
	private int d;
/**
 * 
 * @param y as user input that will be used to calculate m & d
 */
	public GaussianEaster(int y) {
		int A = y % 19; // location of the year in the Metonic cycle
		int B = y % 4; // number of leap days according to Julian calendar
		int C = y % 7; // non-leap years 

		double P = (float) Math.floor(y / 100);
		double Q = (float) Math.floor((13 + 8 * P) / 25);
		double M = (15 - Q + P - (P / 4)) % 30;

		double N = (4 + P - (P / 4)) % 7;
		double D = (19*A + M) % 30;

		double E = (N + 2*B + 4*C + 6*D) % 7;
		int days = (int) (22 + D + E);
		
		if ((D == 29) && (E == 6)) { // April 19
			m = 4;
			d = 19;
		} 
		else if ((D == 28) && (E == 6)) { // April 18
			m = 4;
			d = 18;
		} 
		else {
			   if (days > 31) {
				 d = days - 31;
				 m = 4;
			   }
			   else {
				 d = days;
				 m = 3;
			   }
		}   
	}

	public int getM() {
		return m;
	}

	public int getD() {
		return d;
	}
}