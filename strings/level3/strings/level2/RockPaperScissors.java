package level2;
import java.util.Scanner;

public class RockPaperScissors {

    // Get computer's random choice
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    // Determine winner of each game
    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Compute summary stats and return as 2D String array
    public static String[][] getStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] summary = new String[2][3];

        summary[0][0] = "User";
        summary[0][1] = String.valueOf(userWins);
        summary[0][2] = String.valueOf(Math.round((userWins * 100.0 / totalGames) * 100.0) / 100.0);

        summary[1][0] = "Computer";
        summary[1][1] = String.valueOf(compWins);
        summary[1][2] = String.valueOf(Math.round((compWins * 100.0 / totalGames) * 100.0) / 100.0);

        return summary;
    }

    // Display the full result of each game
    public static void displayResults(String[][] rounds, String[][] stats, int draws) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s%-15s%-15s%-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < rounds.length; i++) {
            System.out.printf("%-10d%-15s%-15s%-10s\n", i + 1, rounds[i][0], rounds[i][1], rounds[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.printf("%-10s%-15s%-20s\n", "Player", "Wins", "Winning Percentage");
        System.out.println("--------------------------------------------");
        for (String[] stat : stats) {
            System.out.printf("%-10s%-15s%-20s\n", stat[0], stat[1], stat[2] + " %");
        }

        System.out.println("Draws: " + draws);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[n][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();

            while (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.print("Invalid input. Try again (rock/paper/scissors): ");
                user = sc.nextLine().toLowerCase();
            }

            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            gameResults[i][0] = user;
            gameResults[i][1] = comp;
            gameResults[i][2] = winner;
        }

        String[][] stats = getStats(userWins, compWins, draws, n);
        displayResults(gameResults, stats, draws);
    }
}



