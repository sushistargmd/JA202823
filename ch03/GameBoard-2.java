//public class GameBoard {
//    // (前略)
//
//    public void movePlayer() {
//        if (isCleared) {
//            System.out.println("すでにクリアしています！");
//            return;
//        }
//
//        int steps = 1;
//        int newX = playerX + steps;
//        int newY = playerY;
//
//        // 移動先が範囲外でも、ループして移動するように修正
//        playerX = (newX + 10) % 10;
//        playerY = (newY + 10) % 10;
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
//        board[playerY][playerX] = 'P';
//        printBoard();
//    }
//
//    // (以下略)
//}
