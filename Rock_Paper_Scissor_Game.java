import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int rounds = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(sc);
        }

    }
    public static void playRockPaperScissors(Scanner sc) {
        // getting input from user
        System.out.println("choose your move (rock, paper, scissors)");
        String move = sc.nextLine();

        // getting input from computer
        Random random = new Random();
        int randomMove = random.nextInt(3);

        String computerMove;
        if (randomMove == 0) {
            computerMove = "rock";
        }
        else if (randomMove == 1) {
            computerMove = "paper";
        }
        else {
            computerMove = "scissors";
        }
        System.out.println("computer move: " + computerMove);

        // print results
        if (move.equals(computerMove)) {
            System.out.println("Its draw!");
        }
        else if (moveWins(move, computerMove)){
            System.out.println("you win!");
        }
        else{
            System.out.println("you lose!");
        }
    }
    static boolean moveWins(String move, String computerMove) {
        if (move.equals("rock")) {
            return computerMove.equals("Paper");
        }
        else if (move.equals("paper")) {
            return computerMove.equals("Scissors");
        }
        else {
            return computerMove.equals("Rock");
        }
    }
}
