
public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.run();
		
		Bus b = new Bus();
		b.run();
		
		Taxi t = new Taxi();
		t.run();
		
		v = b;
		v.run();
		v = t;
		v.run();
		
		v= new Vehicle();
		
		System.out.println("-----");
		
		Driver d = new Driver();
		d.drive(v);
		d.drive(b);
		d.drive(t);
	}
	
}
