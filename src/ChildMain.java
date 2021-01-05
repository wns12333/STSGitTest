
public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1 = new Parent1();
		p1.output1();
		p1.output2();
		Child1 c1 = new Child1("형준", "wns@naver.com");
		c1.output1();
		c1.output2();
		System.out.println("c1.name" + c1.name);
		c1.name = "아이유";
		System.out.println("c1.name" + c1.name);
		System.out.println("c1.email" + c1.email);
		/* c1.email = "im@gmail.com"; */
		
		Parent2 p2 = new Parent2();
		p2.output();
		}

}
