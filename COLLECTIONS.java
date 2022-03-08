package Collections;
import java.util.*;

public class COLLECTIONS {

	public static void main(String[] args) {
		

	
				
					List<Integer> numbers=List.of(1,2,1,2,3,5,6);
					
					Set<Integer> setNumbers=new TreeSet<>(numbers);
					
					
					List<Integer> uniqueNumbers=new ArrayList<>(setNumbers);
					
					
					for (int i=0;i<uniqueNumbers.size();i++) {
						int count=0;
						for (int j=0;j<numbers.size();j++) {
							if (uniqueNumbers.get(i)==numbers.get(j)) {
								count=count+1;
							}
						
						}
						System.out.println("Frequency of the number "+uniqueNumbers.get(i)+" :"+"  "+count);
						
						
					}
					
					System.out.println("UNIQUE_NUMBERS_IN_ORDER: "+uniqueNumbers);

				}

			}





	
