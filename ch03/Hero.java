package jp.co.fl.superintro.ch03;

public class Hero {
	String name;//名前の宣言
	int hp;//HPの宣言
	Sword aword;
	int exp;//けいけんちの宣言
    //経験値が増える
	public void attack() {
		System.out.println(this.name+ "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
		this.exp += 300;


	}


	public void sleep() {
		this.hp=100;
		System.out.println(this.name + "眠って回復した！");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println(this.name + "GAMEOVER");
		System.out.println(this.name + "最終HPは"+this.hp+"でした");
	}

	public void slip() {
		this.hp = -5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println(this.name + "は5のダメージ！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");


	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;//引数の値でnameフィールドを初期化
	
	//public Hero() {
		//this("ダミー");



	}


	public Hero() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	



}