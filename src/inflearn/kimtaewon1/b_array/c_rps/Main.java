package inflearn.kimtaewon1.b_array.c_rps;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-03
 */
public class Main {

    private enum Choice {
        SCISSOR, ROCK, PAPER
    }

    private static String getWinner(Choice a, Choice b) {
        if (a == b) return "D";
        else if (a == Choice.SCISSOR && b == Choice.PAPER)
            return "A";
        else if (a == Choice.ROCK && b == Choice.SCISSOR)
            return "A";
        else if (a == Choice.PAPER && b == Choice.ROCK)
            return "A";
        else
            return "B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int games = sc.nextInt();

        Choice[] choices = { Choice.SCISSOR, Choice.ROCK, Choice.PAPER };
        Choice[] userA = new Choice[games];
        Choice[] userB = new Choice[games];

        for (int i = 0; i < games; i++) {
            userA[i] = choices[sc.nextInt() - 1];
        }
        for (int i = 0; i < games; i++) {
            userB[i] = choices[sc.nextInt() - 1];
        }

        for (int i = 0; i < games; i++) {
            System.out.println(getWinner(userA[i], userB[i]));
        }
    }
}
