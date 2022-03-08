package chache;

import java.util.*;

public class CHACHE {
	LinkedHashMap<String,Integer> mapList=new LinkedHashMap<>();
	public static List<String> list=new ArrayList<>();
	

	
	
	public void put(String str,int i) {
		
		if (this.mapList.size()>=3 && list.size()>=3) {
			
			this.mapList.remove(list.get(0));
		    this.mapList.put(str, i);
		    list.remove(0);
		    list.add(str);
		   
		}
		else {
			list.add(str);
			this.mapList.put(str, i);
		}
	}
	
	public int get(String str) {
		   if (mapList.containsKey(str)) {
		    int value=mapList.get(str);
		    list.remove(str);
		    list.add(str);
		    this.mapList.remove(str);
		    this.mapList.put(str, value);
			
		        return mapList.get(str);
		   }
		return -1;
	}
	
	public  void getLRU() {
		System.out.println(list);
		
		
	}
	
		
}	

		
	   
		
		
	  
		
		
	  
	    
		

