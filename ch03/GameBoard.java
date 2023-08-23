package jp.co.fl.superintro.ch03;

import java.util.Random;
import java.util.Scanner;

public class GameBoard {
    private char[][] board;
    private int playerX;
    private int playerY;
    private int stepCount;
    private boolean isCleared;
    private Random random;

    public GameBoard() {
        board = new char[10][10];
        playerX = 0;
        playerY = 0;
        stepCount = 0;
        isCleared = false;
        random = new Random();

        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void movePlayer() {
        if (isCleared) {
            System.out.println("すでにクリアしています！");
            return;
        }

        if (playerX == 9 && playerY == 9) {
            System.out.println("ゴールに到達しました！");
            if (stepCount >= 100) {
                System.out.println("ボスを倒し、BIGMATANGOになりました！クリアです！");
                isCleared = true;
            } else {
                System.out.println("ステップ数が足りません。");
            }
            return;
        }

        int steps = 1; // プレイヤーは必ず1歩進みます
        int newX = playerX + steps;
        int newY = playerY;

        stepCount++;
        playerX = newX;
        playerY = newY;

        if (stepCount % 3 == 0) {
            startBattle(); // 3歩ごとに戦闘を開始
        }

        board[playerY][playerX] = 'P'; // プレイヤーの位置を示す文字
        printBoard();
    }

    private void startBattle() {
        System.out.println("敵が現れた！戦闘に突入します。");
        int enemyCount = random.nextInt(3) + 1; // 1から3体の敵が出現
        fightEnemies(enemyCount);
    }

    private void fightEnemies(int count) {
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            if (board[y][x] == '-') {
                board[y][x] = 'E'; // 敵を示す文字
            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        Scanner scanner = new Scanner(System.in);

        while (!gameBoard.isCleared) {
            System.out.println("現在の位置: (" + gameBoard.playerX + ", " + gameBoard.playerY + ")");
            System.out.println("何歩進みますか？");
            int steps = scanner.nextInt();

            for (int i = 0; i < steps; i++) {
                gameBoard.movePlayer();
            }
        }

        scanner.close();
    }
}
