package RedeSociall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sala {
	
	List <String> feed = new ArrayList<>();
	public Sala() {
		
	}
	
	
	public void fazerPostagem(String a) {
		feed.add(a);
		
	}
	public void mostarFeed() {
		for (String l : this.feed) {
			System.out.println(l);
		}
	}
	
	
}
