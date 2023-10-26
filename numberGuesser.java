import java.util.*;

public class numberGuesser {
    public static void main(String args[]) {
        System.out.println("\n\t\t***NUMBER GUESSING GAME***\n");
        Scanner in = new Scanner(System.in);
        boolean round = true;
        while (round) {
            Random ran = new Random();
            int randnum = ran.nextInt(100); // generates a random number between 1-100
            int atmp = 2;
            while (true) {
                System.out.println("\nGuess the number between 1-100!! :");
                int num = in.nextInt();
                if (num == randnum) {
                    System.out.println("Correct Guess !!!!");
                    System.exit(0);
                } else if (num > randnum) {
                    System.out.println("Number is Too High !!\nTry Again!!\n\n");
                } else {
                    System.out.println("Number is Too Low !!\nTry Again!!\n\n");
                }
                if (atmp == 0) {
                    System.out.println("You've lost !!!!");
                    System.out.println("The number was: " + randnum);
                    break;
                }
                System.out.println("Attempts left : " + atmp-- + "\n");
            }
            System.out.println("Do You want play again!! (Y/N)"); //Asks if wants to play again
            char ch = in.next().charAt(0);
            if (ch != 'y' && ch != 'Y') {
                round = false;
            }
        }
        in.close();
    }
}
