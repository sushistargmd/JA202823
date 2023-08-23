////package jp.co.fl.superintro.ch03;
//
//import java.util.Random;
//
//public class GameBoard {
//    private char[][] board;
//    private int playerX;
//    private int playerY;
//    private int stepCount;
//    private boolean isCleared;
//    private Random random;
//
//    public GameBoard() {
//        board = new char[10][10];
//        playerX = 0;
//        playerY = 0;
//        stepCount = 0;
//        isCleared = false;
//        random = new Random();
//
//        initializeBoard();
//    }
//
//    private void initializeBoard() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                board[i][j] = '-';
//            }
//        }
//    }
//
//    public void movePlayer() {
//        if (isCleared) {
//            System.out.println("すでにクリアしています！");
//            return;
//        }
//
//        if (playerX == 9 && playerY == 9) {
//            System.out.println("ゴールに到達しました！");
//            if (stepCount >= 100) {
//                System.out.println("ボスを倒し、BIGMATANGOになりました！クリアです！");
//                isCleared = true;
//            } else {
//                System.out.println("ステップ数が足りません。");
//            }
//            return;
//        }
//        int steps = 1;
//        int newX = playerX + steps;
//        int newY = playerY;
//
//        stepCount++;
//        playerX = newX;
//        playerY = newY;
//
//        if (stepCount == 50) {
//            fightWizard();
//        } else if (stepCount >= 51 && stepCount <= 99) {
//            fightEnemies(2);
//        } else if (stepCount == 100) {
//            fightEnemies(2);
//            System.out.println("2体の敵を倒し、BIGMATANGOになりました！");
//        } else if (stepCount % 5 == 0) {
//            if (random.nextInt(2) == 0) {
//                fightEnemies(1);
//            }
//        }
//
//        if (playerX >= 0 && playerX < 10 && playerY >= 0 && playerY < 10) {
//            board[playerY][playerX] = 'P';
//        } else {
//            System.out.println("プレイヤーが移動しようとしていますが、範囲外です！");
//        }
//        printBoard();
//    }
//
//    // 以下、fightWizard、fightEnemies、printBoard メソッドの実装が続きます。
//
//    // main メソッドも同じく実装されています。
//
//    public static void main(String[] args) {
//        GameBoard gameBoard = new GameBoard();
//        for (int i = 0; i < 100; i++) {
//            gameBoard.movePlayer();
//        }
//    }
//}
