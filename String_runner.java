package stringjoiner;
import java.util.*;

public class STRINGRUNNER {

	public static void main(String[] args) {
		
		
		        StringJoiner sj1=new StringJoiner("-");
		
				
				for (int i=0;i<=2;i++) {
					Scanner input=new Scanner(System.in);
					System.out.print("Enter string: ");
					String word=input.nextLine();
					sj1.add(word);
				}
				
				
				
				System.out.println("stringjoiner: "+sj1.toString());
				System.out.println("Length of Stringjoiner: " + sj1.length());
				
				

			}

}