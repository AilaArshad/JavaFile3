import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int remainingBalls = 120;
    private static int sumBalls = 0;
    private static int teamsScore = 0;
    private static Random random = new Random();
    private static int nameWidth;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] players1_Name = new String[11];
        String[] players2_Name = new String[11];
        System.out.println("Enter Team1 players name: ");
        for (int i = 0; i < players1_Name.length; i++) {
            players1_Name[i] = input.nextLine();
        }
        System.out.println("Enter Team2 players name: ");
        for (int i = 0; i < players2_Name.length; i++) {
            players2_Name[i] = input.nextLine();
        }
        toss();
        System.out.println("********Team 1**********");
        List<String> team1Players = new ArrayList<>(List.of(players1_Name));
        score(team1Players);
        int team1_Score = teamsScore;
        teamsScore = 0;
        System.out.println("********Team 2**********");
        List<String> team2Players = new ArrayList<>(List.of(players2_Name));
        remainingBalls = 120;
        sumBalls = 0;
        score(team2Players);
        int team2_Score = teamsScore;
        if (team1_Score > team2_Score) {
            System.out.println("Team 1 is the winner team");
        } else {
            System.out.println("Team 2 is the winner team");
        }
    }

    private static int runs() {
        int run = random.nextInt(100);
        teamsScore += run;
        return run;
    }

    private static int balls() {
        int ball = random.nextInt(remainingBalls) + 1;
        remainingBalls -= ball;
        sumBalls += ball;
        return ball;
    }

    private static float strikeRate(int runs, int balls) {
        return ((float) runs / (float) balls) * 100;
    }

    private static void toss() {
        int tossWin = random.nextInt(2);
        if (tossWin == 0) {
            System.out.println("Team 1 win the toss");
        } else {
            System.out.println("Team 2 win the toss");
        }
    }

    private static void score(List<String> players) {
        int nameWidth = 10;
        int runsWidth = 5;
        int ballsWidth = 5;
        int strikeRateWidth = 10;
        System.out.printf("%-" + nameWidth + "s %" + runsWidth + "s %" + ballsWidth + "s %" + strikeRateWidth + "s%n", "Player", "Runs", "Balls", "Strike Rate");
        while (remainingBalls > 0 && !players.isEmpty()) {
            String name = getNextPlayer(players);
            int run = runs();
            int ball = balls();
            float strike = strikeRate(run, ball);
            System.out.printf("%-" + nameWidth + "s %" + runsWidth + "d %" + ballsWidth + "d %" + strikeRateWidth + ".2f%n", name, run, ball, strike);
        }
    }


    private static String getNextPlayer(List<String> players) {
        if (players.isEmpty()) {
            return "";
        }
        int index = random.nextInt(players.size());
        return players.remove(index);

    }

}



