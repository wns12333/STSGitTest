
public class Overwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Player p = new Player();
	  Triser t = new Triser();
	  Character c = new Character();
	  
	  p.cMove(t); // t.move()  
	  p.cStop(t); // t.stop()
	  p.cAttack(t); // t.Attack();
	  p.cSkill(t);
	  

	  Genzi g = new Genzi();
	  p.cAttack(g); // g.attck()
	  p.cMove(g);
	  p.cStop(g);
	  p.cSkill(g);
	   
	  c = new Mac(); // c 부모 mac 자식
	  p.cAttack(c); // c.attck();
	  p.cMove(c);
	  p.cStop(c);
	  p.cSkill(c);
	  
	  c = t; // 
	  
	  p.cAttack(c);
	  p.cMove(c);
	  p.cStop(c);
	  p.cSkill(c);
	  
	  c = g;
	  p.cAttack(c);
	  p.cMove(c);
	  p.cStop(c);
	  p.cSkill(c);
	  
	}
	

}
