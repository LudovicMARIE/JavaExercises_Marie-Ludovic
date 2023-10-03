import java.util.Scanner;
import java.util.Random;

public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[][] board = new int[3][3];
        int row, column;
        int player = 1;
        int winner = 0;
        boolean validInput = false;

        // Draw empty game board
        drawBoard(board);

        // Game lasts 9 turns
        for (int i = 0; i < 9; i++) {
            validInput = false;
            // Infinite loop to read proper cell coordinates
            while (!validInput) {
                System.out.print("Joueur "+(player == 1 ? "X" : "O") + ", c'est à votre tour. Entrez la ligne (0-2) et la colonne (0-2) :");
                row = input.nextInt();
                column = input.nextInt();
                if (board[row][column] == 0) {
                    board[row][column] = player;
                    validInput = true;
                } else {
                    System.out.println("That cell is already occupied. Try again.");
                }
            }
            drawBoard(board);
            winner = checkWinner(board);
            if (winner != 0) {
                break;
            }
            player = (player == 1 ? 2 : 1);
            if (player == 2) {
                // Randomly select a cell for player 2
                row = rand.nextInt(3);
                column = rand.nextInt(3);
                while (board[row][column] != 0) {
                    row = rand.nextInt(3);
                    column = rand.nextInt(3);
                }
                System.out.println("Joueur O, c'est à toi de jouer : (ligne) " + row + " (colonne) " + column);
                board[row][column] = 2;
                drawBoard(board);
                winner = checkWinner(board);
                if (winner != 0) {
                    break;
                }
                player = 1;
            }
        }
        if (winner == 1) {
            System.out.println("Joueur X a gagné !");
        } else if (winner == 2) {
            System.out.println("Joueur 0 a gagné !");
        } else {
            System.out.println("Égalité !");
        }
    }

    public static void drawBoard(int[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    System.out.print("  | ");
                } else if (board[i][j] == 1) {
                    System.out.print("X | ");
                } else {
                    System.out.print("O | ");
                }
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static int checkWinner(int[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return board[i][0];
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                return board[0][i];
            }
        }
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return board[0][2];
        }
        // Check for tie
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    tie = false;
                    break;
                }
            }
            if (!tie) {
                break;
            }
        }
        if (tie) {
            return 3;
        }
        return 0;
    }
}