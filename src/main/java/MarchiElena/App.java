package MarchiElena;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dammi pidgeys: ");
        int pidgeys = scan.nextInt();
        System.out.println("Dammi candy: ");
        int candy = scan.nextInt();
        System.out.println("XP massimi: " + maxXP(pidgeys, candy));
    }

    public static int maxXP(int pidgeys, int candy) {
        int xp = 0;
        while (pidgeys > 0) {
            if (candy >= 12) {          // evolvo
                candy = candy - 12;     // posso scrivere candy -12 +1;
                pidgeys = pidgeys - 1;
                xp = xp + 500;
                candy = candy + 1;

            } else {                    //trasferisco
                pidgeys = pidgeys - 1;
                candy = candy + 1;
            }
        }

        return xp;
    }
}
