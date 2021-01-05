
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s = new Student("아이유");
		System.out.println(s.name);
		p = s;
		System.out.println(p.name);
		
		/*
		 * p.grade = "A"; p.department = "Com";
		 */
	}

}
