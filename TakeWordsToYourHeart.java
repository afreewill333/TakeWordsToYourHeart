import java.io.*;
import java.util.*;

public class TakeWordsToYourHeart {

	public static void main(String[] args){
		Integer unitcount=42;// the number of total units 
		Integer teamcount=1; // the number of each team
		Integer threshold=5; // the argument beyond which stop to start a new unit
		List<Integer> ruler = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,12,21));//the list story the days that should review unit
		List plans = new LinkedList<List>();

		/*
			step 1: put the new unit into the each day of the list plans from the first to the last.
			step 2: put the unit should been reviewed to the days of the plan from the first to the last.
			step 3: check: if a day where the number of reviewed units exceed the threshold, insert a copy of it after the day.
		*/
		for(int i=0;i<unitcount;i++){
			List temp = new LinkedList<Integer>();
			
			for(int j=0;j<teamcount;j++){
				temp.add(i+1);
				i++;
			days.add(temp);
			


		System.out.println("It is a Test ~ .");
	}
}


