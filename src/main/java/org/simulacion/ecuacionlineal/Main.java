package org.simulacion.ecuacionlineal;

import java.util.Scanner;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        try {
        	sc = new Scanner(System.in);
            double A,B,C;
            //  4x + y – 17 = 0
            A = -2.00000000;
            B = 1;
            C = -17;
            /*
            System.out.print("Ingrese A:");
            A = sc.nextDouble();
            System.out.print("Ingrese B:");
            B = sc.nextDouble();
            System.out.print("Ingrese C:");
            C = sc.nextDouble();
            */
            Recta r1 = new Recta(A, B, C);
            
            System.out.println(  r1.toString("principal"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
