package jp.co.fl.superintro.ch03;

public class Wizard {
//50歩目で敵として出てくる
	//倒すと仲間になる
	String name;
	int hp;

	public static void main(String[] args) {
		String s = new String("こんにちは");
		System.out.println(s);

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アカサ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name  = "スガワラ";
		w.hp = 50;
		w.heal(h1);//ミナトを回復させる（HP：100→110）
		w.heal(h2);//アサカを回復させる（HP：100→110）
		w.heal(h2);//アサカを回復させる（HP：110→120）
	}
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");

	}
}


