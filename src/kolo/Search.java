package kolo;

import java.util.ArrayList;

public class Search {

	private ArrayList<User> list;
	
	public ArrayList<User> getList() {
		return list;
	}

	public void setList(ArrayList<User> list) {
		this.list = list;
	}
	

	public User byAge (int age){
		
		for (int i=0; i< list.size(); i++)
		{
			if (list.get(i).getAge()==age){
				return list.get(i);
				}
		}
		return null;
		
				
	}
	
	public User bySurname (String surname){
		
		for (int i=0; i< list.size(); i++)
		{
			if (list.get(i).getSurname()==surname){
				return list.get(i);
				}
		}
		return null;
	}
		
				
	
	
}
