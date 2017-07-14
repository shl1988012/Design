package design.decorator.demo3;

public class Client {

	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		//纯粹的装饰模式
//		TheGreatestSage fish = new  Fish(sage);
//		TheGreatestSage bird = new Bird(fish);
//		bird.move();
		
//		TheGreatestSage bird = new Bird(new Fish(sage)) ;
//		bird.move();
		
		//半透明的装饰模式   :介于装饰模式和适配器模式之间的
		Bird bird = new Bird(sage);
		bird.fly();
	}
}
