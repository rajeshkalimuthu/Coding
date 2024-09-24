package collection;

import java.util.ArrayList;
import java.util.List;

public class GetterStter extends PojoClass{
	public static void main(String[] args) {
		
	
	
	List<GetterStter> gs=new ArrayList<GetterStter>();
	GetterStter g= new GetterStter();
	g.setId(123);
	g.setName("nelu");
	g.setVillage("Peravurani");
	g.setId(456);
	System.out.println(g.getId());
	System.out.println(g.getName());
	System.out.println(g.getVillage());
	GetterStter g2= new GetterStter();
	g2.setId(767);
	g2.setName("neelu");
	g2.setVillage("Kondraikadu");
	gs.add(g2);
	gs.add(g);
	for(GetterStter h:gs) {
		System.out.println(h.getId());
		System.out.println(h.getName());
		System.out.println(h.getVillage());
	}
	

}
}
