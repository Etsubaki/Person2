
public class Person {

	public String name = null;
	public int age = 0;
	
	//コンストラクタ①
	public Person() {}
		
	//コンストラクタ②
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		//thisとは「このクラス」のインスタンスのフィールド(変数)であることを指す
		//上記ではTestの("jiro", 20)に合う型(String name, int age)を作成している
	}
	
}
