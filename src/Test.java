
public class Test {
	
	public static void main(String[] args) {
		
		//コンストラクタ①を使ったインスタンス化(インスタンス化のテキストと同じもの)
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;

		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//コンストラクタ②を使ったインスタンス化(①より2行節約できる)
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
	}

}
