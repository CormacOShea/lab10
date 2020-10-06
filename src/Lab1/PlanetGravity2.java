package Lab1;
//PlanetGravity2.java

/*This program calculates the acceleration due to gravity on a different planet based
on the user-supplied values for the mass and radius of the planet and the mass and radius of Earth*/

import java.util.Scanner;

public class PlanetGravity2 {
    public static void main(String[] args) {
        final float g = 9.81f;
        float mp, me, re, rp, gp;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet Earth: ");
        mp = input.nextFloat();

        System.out.print("Please enter the radius of planet Earth: ");
        me = input.nextFloat();

        System.out.print("Please enter the mass of the other planet: ");
        re = input.nextFloat();

        System.out.print("Please enter the radius of the other planet: ");
        rp = input.nextFloat();

        gp = g*mp*rp*rp/(me*re*re);

        System.out.println("\n\nThe acceleration due to gravity on the other planet is " +
                String.format("%.2f",gp ) + "ms/s/s");
    }
}
