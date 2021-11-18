
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Teams> records = readFromFile(file);

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int counter = 0;
        int wins = 0;
        int losses = 0;

        for (Teams index : records) {

            if (index.getHomeTeam().contains(teamName)) {
                counter += 1;

                if (index.getHomeScore() >= index.getAwayScore()) {
                    wins += 1;
                    index.setWins();
                } else {
                    losses += 1;
                    index.setLosses();
                }

                index.playGame();
            } else if (index.getAwayTeam().contains(teamName)) {
                counter += 1;

                if (index.getAwayScore() >= index.getHomeScore()) {
                    wins += 1;
                    index.setWins();
                } else {
                    losses += 1;
                    index.setLosses();
                }

                index.playGame();
            }

        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Teams> readFromFile(String fileName) {
        ArrayList<Teams> games = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String opposingTeam = parts[1];

                int homePoints = Integer.valueOf(parts[2]);
                int opposingPoints = Integer.valueOf(parts[3]);

                games.add(new Teams(homeTeam, opposingTeam, homePoints, opposingPoints));
            }
        } catch (Exception e) {
            System.out.println("Failed to read from file.");
        }
        return games;
    }
}
