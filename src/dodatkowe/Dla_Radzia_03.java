package dodatkowe;
import java.util.Scanner;

public class Dla_Radzia_03 {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[][] {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        printBoard(board);
        while(isFinished(board) != 'x' && isFinished(board) != 'o') {
            System.out.print("Ruch O (podaj indeks wiersza, a następnie indeks kolumny): ");
            while(!place(board, sc.nextInt(), sc.nextInt(), 'o')) {
                System.out.println("Błędne współrzędne, podaj jeszcze raz");
            }
            printBoard(board);
            if(isFinished(board) == 'o')
                break;
            System.out.print("Ruch X (podaj indeks wiersza, a następnie indeks kolumny): ");
            while(!place(board, sc.nextInt(), sc.nextInt(), 'x')) {
                System.out.println("Błędne współrzędne, podaj jeszcze raz");
            }
            printBoard(board);
        }
        if(isFinished(board) == 'x')
            System.out.println("Wygrał X!");
        else
            System.out.println("Wygrał O!");
        sc.close();
    }

    public static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if (board[i][j] == '-')
                    System.out.print(" ");
                else
                    System.out.print(board[i][j]);
                if (j != 2)
                    System.out.print("|");
                else
                    System.out.println();
            }
        }
    }

    public static char isFinished(char[][] board) {
        if (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o')
            return 'o';
        if (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o')
            return 'o';
        if (board[2][0] == 'o' && board[2][1] == 'o' && board[1][2] == 'o')
            return 'o';
        if (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o')
            return 'o';
        if (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o')
            return 'o';
        if (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o')
            return 'o';
        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o')
            return 'o';
        if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')
            return 'o';

        if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x')
            return 'x';
        if (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x')
            return 'x';
        if (board[2][0] == 'x' && board[2][1] == 'x' && board[1][2] == 'x')
            return 'x';
        if (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x')
            return 'x';
        if (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x')
            return 'x';
        if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x')
            return 'x';
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x')
            return 'x';
        if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')
            return 'x';
        return '-';
    }

    public static boolean place(char[][] board, int row, int col, char letter) {
        if((row > 0 && row < 4) // sprawdza czy rzad jest dobry
            && (col > 0 && col < 4)//sprawdza czy kolumna jest dobra
            && board[row - 1][col -1] == '-')  {//sprawdza czy miejsce nie jest juz zajete
            board[row - 1][col - 1] = letter;
            return true;
        }
        else
            return false;
    }
}