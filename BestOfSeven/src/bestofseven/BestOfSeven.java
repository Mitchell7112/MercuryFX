/*
 * BestOfSeven
 */
package bestofseven;

import java.util.Scanner;

/**
 * Purpose Best of Seven
 *
 * @author Mitchell Wan
 */
public class BestOfSeven {

    public static void main(String[] args) {
        System.out.println("Dit programma is gemaakt door: Mitchell Wan, IS107, 500779507");
        Scanner input = new Scanner(System.in);
        String team1;
        System.out.print("Wat is de naam van team 1? ");
        team1 = input.nextLine();
        String team2;
        System.out.print("Wat is de naam van team 2? ");
        team2 = input.nextLine();
        
        int[] team1Arr = new int[7];
        int[] team2Arr = new int[7];
        int team1Punt = 0;
        int team2Punt = 0;
        int i;
        for (i = 0; i < 7; i++) {
            System.out.print("Uitslag wedstrijd " + (i+1) + ": " + "\n"
                    + "Aantal punten " + team1 + ": ");
            team1Arr[i] = input.nextInt();
            System.out.print("Aantal punten " + team2 + ": ");
            team2Arr[i] = input.nextInt();

            if (team1Arr[i] < team2Arr[i]) {
                team2Punt++;

            } else {
                team1Punt++;

            }
            if (team1Punt == 4) {
                break;
            } else if (team2Punt == 4) {
                break;
            }
        }
        System.out.println("Aantal gespeelde wedstrijden: " + i);
        printWinnaar(team1, team2, team1Punt, team2Punt);
        System.out.println("");
        int j;
        for (j = 0; j <= i; j++) {
            System.out.println("wedstrijd " + (j+1) + ": " + team1 + " - " + team2 + " " +
                    team1Arr[j] + " - " + team2Arr[j]);
        }
        }
    
    public static void printWinnaar(String team1, String team2, int aantalWinstTeam1
            , int aantalWinstTeam2) {
        
        if (aantalWinstTeam1 < aantalWinstTeam2) {
            System.out.println(team2 + " heeft gewonnen met " + aantalWinstTeam2 + " - " + aantalWinstTeam1);
        }
        else if (aantalWinstTeam2 < aantalWinstTeam1) {
            System.out.println(team1 + " heeft gewonnen met " + aantalWinstTeam1 + " - " + aantalWinstTeam2);
        }
    }
    
    }

    
