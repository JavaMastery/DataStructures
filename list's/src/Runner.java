
public class Runner {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.list();System.out.println();
		l.remove(0);
		l.list();System.out.println();
		l.add(4);
		l.list();System.out.println();
		l.remove(2);
		l.list();
	}

}
