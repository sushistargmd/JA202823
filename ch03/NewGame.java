package jp.co.fl.superintro.ch03;

import java.util.Scanner;

public class NewGame {

	public static void main(String[] args) {
		System.out.println("どうする？");
		System.out.println("右" + "左" + "上" + "下");
		System.out.println("ステータス確認");


		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while (count < 5) {
			System.out.print("どこに行く?: ");
			String input = scanner.nextLine();

			if (input.equals("右")) {
				count++;
			}
		}

		System.out.println("クリア");
	}













	Scanner sc = new Scanner(System.in);
	String str =sc.nextLine();{

		if(str.equals("右")) {
			System.out.println();
		}else {
			System.out.println("h以外の「"+str+"」Lowを選択されました。");

		}	

	}

}
