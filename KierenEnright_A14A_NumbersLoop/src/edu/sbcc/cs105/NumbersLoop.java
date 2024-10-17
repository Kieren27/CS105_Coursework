package edu.sbcc.cs105;

public class NumbersLoop {

  // TODO add instance variables
  private int lowerLimit;
  private int upperLimit;
  private int sum;
/**
 * Lower limit of number range assigned to instance var
 * 
 * @param l
 */
  // TODO add Javadoc comments and implement method setLowerLimit()
  public void setLowerLimit(int l) {
    this.lowerLimit = l;
  }

/**
 * Upper limit of number range assigned to instance var
 * 
 * @param u
 */
  // TODO add Javadoc comments and implement method setUpperLimit()
  public void setUpperLimit(int u) {
    this.upperLimit = u;
  }

/**
 * returns sum of all numbers within provided range
 * 
 * @return sum
 */
  // TODO add Javadoc comments and implement method addLowerAllTheWayToUpper()
  public int addLowerAllTheWayToUpper() {
    for (int i = lowerLimit; i <= upperLimit; i++) {
      sum += i;
    }
    return sum;
  }
}