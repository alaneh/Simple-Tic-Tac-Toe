package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char x[][] = new char[3][3];
        x[0][0] = ' ';
        x[0][1] = ' ';
        x[0][2] = ' ';
        x[1][0] = ' ';
        x[1][1] = ' ';
        x[1][2] = ' ';
        x[2][0] = ' ';
        x[2][1] = ' ';
        x[2][2] = ' ';
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(x[i][j] + " ");
                if (j == 2) {
                    System.out.println("|");
                }
            }
        }
        System.out.println("---------");
        boolean seguir = true;
        boolean turn = true;
        while (seguir) {
            boolean alf = true;
            while (alf) {
                System.out.print("Enter the coordinates: ");
                String rows = scanner.next();
                String cols = scanner.next();
                if (rows.length() > 1) {
                    System.out.println("You should enter numbers!");
                } else {
                    if (cols.length() > 1) {
                        System.out.println("You should enter numbers!");
                    } else {
                        char c = cols.charAt(0);
                        boolean n = Character.isDigit(c);
                        if (n) {
                            int r = Integer.parseInt(rows);
                            int cls = Integer.parseInt(cols);
                            /* */
                            if (r > 3 || r < 1 || cls > 3 || cls < 1) {
                                System.out.println("Coordinates should be from 1 to 3!");
                            } else {
                                if (x[r-1][cls-1] == 'X' || x[r-1][cls-1] == 'O') {
                                    System.out.println("This cell is occupied! Choose another one!");
                                } else {
                                    if (turn) {
                                        x[r-1][cls-1] = 'X';
                                        turn = false;
                                    } else {
                                        x[r-1][cls-1] = 'O';
                                        turn = true;
                                    }
                                    alf = false;
                                    break;
                                }
                            }
                        } else {
                            System.out.println("You should enter numbers!");
                        }
                    }
                }
            }
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3;j++) {
                    if (j == 0) {
                        System.out.print("| ");
                    }
                    System.out.print(x[i][j] + " ");
                    if (j == 2) {
                        System.out.println("|");
                    }
                }
            }
            System.out.println("---------");
            boolean case1X = x[0][0] == 'X' && x[1][0] == 'X' && x[2][0] == 'X';
            boolean case2X = x[0][1] == 'X' && x[1][1] == 'X' && x[2][1] == 'X';
            boolean case3X = x[0][2] == 'X' && x[1][2] == 'X' && x[2][2] == 'X';
            boolean case4X = x[0][0] == 'X' && x[0][1] == 'X' && x[0][2] == 'X';
            boolean case5X = x[1][0] == 'X' && x[1][1] == 'X' && x[1][2] == 'X';
            boolean case6X = x[2][0] == 'X' && x[2][1] == 'X' && x[2][2] == 'X';
            boolean case7X = x[0][0] == 'X' && x[1][1] == 'X' && x[2][2] == 'X';
            boolean case8X = x[0][2] == 'X' && x[1][1] == 'X' && x[2][0] == 'X';

            boolean casosX = case1X || case2X || case3X || case4X || case5X || case6X || case7X || case8X;

            boolean case1O = x[0][0] == 'O' && x[1][0] == 'O' && x[2][0] == 'O';
            boolean case2O = x[0][1] == 'O' && x[1][1] == 'O' && x[2][1] == 'O';
            boolean case3O = x[0][2] == 'O' && x[1][2] == 'O' && x[2][2] == 'O';
            boolean case4O = x[0][0] == 'O' && x[0][1] == 'O' && x[0][2] == 'O';
            boolean case5O = x[1][0] == 'O' && x[1][1] == 'O' && x[1][2] == 'O';
            boolean case6O = x[2][0] == 'O' && x[2][1] == 'O' && x[2][2] == 'O';
            boolean case7O = x[0][0] == 'O' && x[1][1] == 'O' && x[2][2] == 'O';
            boolean case8O = x[0][2] == 'O' && x[1][1] == 'O' && x[2][0] == 'O';

            boolean casosO = case1O || case2O || case3O || case4O || case5O || case6O || case7O || case8O;
            int y = 0;
            int cross = 0;
            int letters = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3;j++) {
                    y++;
                    if (x[i][j] == 'X') {
                        cross++;
                    }
                    if (x[i][j] == 'O') {
                        letters++;
                    }
                }
            }
            if (casosX) {
                System.out.println("X wins");
                seguir = false;
                break;
            } else {
                if (casosO) {
                    System.out.println("O wins");
                    seguir = false;
                    break;
                } else {
                    if (cross == 4 && letters == 5 || cross == 5 && letters ==4) {
                        System.out.println("Draw");
                        seguir = false;
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        }
    }