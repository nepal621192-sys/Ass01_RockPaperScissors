import java.util.Scanner;

public class Game {
    static void main(String[] args) {
        //Vars
        String playerA = "";
        String playerB = "";
        String cont = "";
        boolean checkA;
        boolean checkB;
        boolean playCheck1;
        boolean playCheck2;
        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            checkA = false;
            checkB = false;
            playCheck1 = false;
            playCheck2 = false;

            //Player A
            do {
                System.out.println("Player A move (R, P, or S):");

                if (scan.hasNextLine()) {
                    playerA = scan.nextLine();

                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                        checkA = true;
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error.");
                }
            } while (!checkA);

            //Player B
            do {
                System.out.println("Player B move (R, P, or S):");

                if (scan.hasNextLine()) {
                    playerB = scan.nextLine();

                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                        checkB = true;
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error.");
                }
            } while (!checkB);

            //Winner Decision
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Tie.");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock, B wins.");
                } else {
                    System.out.println("Rock breaks scissors, A wins.");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock, A wins.");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Tie.");
                } else {
                    System.out.println("Scissors cuts paper, B wins.");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks scissors, B wins.");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper, A wins.");
                } else {
                    System.out.println("Tie.");
                }
            }

            //Replay
            do {
                System.out.println("Play again? [Y/N]");
                cont = scan.nextLine();

                if (cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("N")) {
                    playCheck2 = true;
                } else {
                    System.out.println("Error.");
                }

                if (cont.equalsIgnoreCase("N")) {
                    playCheck1 = true;
                }
            } while (!playCheck2);

        } while (!playCheck1);
    }
}
