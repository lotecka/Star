package Zadania;

import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		char star = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number * 2; j++) {
                if (j < (number - i) || j > (number + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
