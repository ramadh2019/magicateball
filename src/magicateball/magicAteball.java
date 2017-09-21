package magicateball;

import javax.swing.JOptionPane;

public class magicAteball {

	public static void main(String[] args) {

		String response;
		int a;
		int attempts = 0;
		String hello;
		int death;
		int MAX_HEALTH = 100;
		String bike;
		String run;
		String swim;

		a = (int) (Math.random() * 5);
		response = JOptionPane
				.showInputDialog("Type okay, to start and find out what your favorite cookie will be in 10 years!");

		if (a == 1) {
			System.out.println("Chocolate Chip");
			attempts = attempts + 1;
		}

		if (a == 2) {
			System.out.println("Sugar Cookie");
			attempts = attempts + 1;
		}

		if (a == 3) {
			System.out.println("Double Chocolate Chip");
			attempts = attempts + 1;
		}

		if (a == 4) {
			System.out.println("Oatmeal");
			attempts = attempts + 1;
		}

		response = JOptionPane.showInputDialog("How many of those cookies have you eaten today?");
		death = Integer.parseInt(response);

		System.out.print("Death: [");
		for (int i = 0; i < death; i++) {

			System.out.print("X");

		}

		for (int i = 0; i < (MAX_HEALTH - death); i++) {

			System.out.print(" ");
		}

		System.out.println("]");

		if (death >= 15) {

			System.out.println("You need some exersize! Here are a few things you can do");
			hello = JOptionPane.showInputDialog("Do you want to bike, run, or swim?");

			if (hello.equals("bike")) {

				death = death - 10;
			}
			if (hello.equals("swim")) {

				death = death - 25;
			}

			if (hello.equals("run")) {

				death = death - 5;
			}

		}

		System.out.println("You are " + death + "% dead.");

	}

}
