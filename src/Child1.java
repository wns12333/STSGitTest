
public class Child1 extends Parent1{
	public String name;
	public final String email;
	public Child1(String name, String email){
		this.name = name;
		this.email = email;
	}
	@Override
	public void output1() {
		System.out.println("Child1의 output1 메서드");
	}
//	@Override
//	public void output2() {
//		System.out.println("Child1의 output2 메서드");
//	}
}
