package chache;

public class CHACHERUNNER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CHACHE chache=new CHACHE();
		chache.put("A", 1);
		chache.put("B", 2);
		chache.put("C",3);
		chache.put("D",4);
		
		
		
		
		
		
	
		
	     System.out.println(chache.get("D"));
		chache.getLRU();
		
		
		

	}

}
