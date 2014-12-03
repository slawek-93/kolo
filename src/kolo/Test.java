package kolo;

import java.util.ArrayList;
import kolo.Search;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	IT worker1 = new IT("Jan", "Kowalski", 30, "424534", "java");
	IT worker2 = new IT("Stefan", "Batory", 32, "458924", "c++");
	Teacher worker3 = new Teacher("Oliwia", "Cudnik", 21, "English");
	Teacher worker4 = new Teacher("Barrack", "Obama", 40, "Chemistry");
	Bankworker worker5 = new Bankworker("Johny", "Anything", 20, "666666", "kasjer");
	Bankworker worker6 = new Bankworker("Johny", "Deep", 20, "662666", "kasjer");
	
	ArrayList<User> list = new ArrayList<User>();
	
	Search search = new Search();
	list.add(worker1);
	list.add(worker2);
	search.setList(list);
	System.out.println(search.byAge(30));
	System.out.println(search.bySurname("Batory"));
	System.out.println(search.bySurname("..."));
	
	
	}

}
