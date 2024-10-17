package edu.sbcc.cs105;

public class Population {

  // TODO add instance variables
  private int population;
  private int targetPopulation;

  // TODO add Javadoc comments and implement method setPopulation()
  /**
   * 
   * @param population population value assigned via user input through instance variable population
   */
  public void setPopulation(int population) {
    this.population = population;
  }

  /**
   * 
   * @param targetPopulation targetPopulation value assigned via user input through instance variable targetPopulation
   */
  public void setTargetPopulation(int targetPopulation) {
    this.targetPopulation = targetPopulation;
  }

  // TODO add Javadoc comments and implement method getPopulation()
  /**
   * 
   * @return population
   */
  public int getPopulation() {
    return population;
  }

  /**
   * 
   * @return targetPopulation
   */
  public int getTargetPopulation() {
    return targetPopulation;
  }

  // TODO add Javadoc comments and implement method
  // getNumberOfYearsToReachThisPopulation()
  /**
   * 
   * @param increaseRate user input annual rate of population increase (percentage)
   * @param population gets assigned the return value of method getPopulation()
   * @return years
   */
  public int getNumberOfYearsToReachThisPopulation(int increaseRate, int population) {
    int years = 0;
    double currentPopulation = population;

    while (currentPopulation < targetPopulation) {
      currentPopulation += currentPopulation * (increaseRate / 100.0);
      years++;
    }
    return years;
  }
}