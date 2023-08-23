package jp.co.fl.superintro.ch03;
//勇者のレベルが10になったら変更
//武器の名前と勇者が変わる
public class SuperHero {

	public static void main(String[] args) {
		int hp = 100;
		int exp = 100;
		System.out.println("経験値"	 + exp);

	}

	private boolean flying;
	private String name = "ミナト";
	//戦う
	public int exp;



	public void attack(Matango m) {
		if(this.flying) {

			System.out.println(this.name + "の攻撃！");

			m.hp -= 5;

			System.out.println("5ポイントのダメージを与えた！");
		}
	}

	//逃げる
	public void run () {
		System.out.println(this.name + "は逃げ出した!");

	}
	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!!");

	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}






}

