package edu.sbcc.cs105;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        CarYear ty = new CarYear();
        Scanner sc = new Scanner(system.in);

        System.out.println("Please input your car's year: ");
        int cy = sc.nextInt();
        
        ty.carYear(cy);

        sc.close();
    }
}
