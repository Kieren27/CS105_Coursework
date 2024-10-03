package edu.sbcc.cs105;

public class CarYear {

    private int carYear;

    public test(int carYear) {

        if (this.carYear < 1968) {
            System.out.println("Probably has few saftey measures.");
        }

        if (this.carYear > 1969) {
            System.out.println("Probably has head rests.");
        }

        if (this.carYear > 1991) {
            System.out.println("Probably has electronic stability control.");
        }

        if (this.carYear > 2002) {
            System.out.println("Probably has airbags.");
        }
    }
}
