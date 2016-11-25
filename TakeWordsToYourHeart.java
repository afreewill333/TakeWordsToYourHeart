import java.io.*;
import java.util.*;

public class TakeWordsToYourHeart {

	public static void main(String[] args){
		Integer unitcount=42;// the number of total units 
		Integer teamcount=1; // the number of each team
		Integer threshold=5; // the argument beyond which stop to start a new unit
		List<Integer> ruler = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,12,21));//the list story the days that should review unit
		List plans = new LinkedList<List<List>>();

		/*
			step 1: put the new unit into the each day of the list plans from the first to the last.
			step 2: put the unit should been reviewed to the days of the plan from the first to the last.
			step 3: check: if a day where the number of reviewed units exceed the threshold, insert a copy of it after the day.
			plans : day1	day2	day3	day4	day5	day6	day7
			       [123]    123		456
					       [456]    123
							       [789] 
					        
		*/
		//step 1
		for(int i=0,count=0;i<Math.ceil(1.*unitcount/teamcount);i++){
			List newunit = new ArrayList<Integer>();
			for(int j=0;j<teamcount;j++){
				count++;
				newunit.add(count);
				if(count==unitcount)
					break;
			}
			List dayplan=new LinkedList<ArrayList>();
			dayplan.add(newunit);
			plans.add(dayplan);
		}		
		for(int i=0;i<ruler.get(ruler.size()-1);i++){
			List newunit = new ArrayList<Integer>();
			List dayplan=new LinkedList<ArrayList>();
			dayplan.add(newunit);
			plans.add(dayplan);
		}

		//step 2
		for(int i=0;i<Math.ceil(1.*unitcount/teamcount);i++){
			List dayplan = (List<List>)plans.get(i); 
			List newunit = (List)dayplan.get(dayplan.size()-1);
			for(int p=1;p<ruler.size();p++){
				int diff = ruler.get(p)-1;
				List<List> newdays = (List<List>)plans.get(i+diff);
				newdays.add(0,newunit);
			}
			System.out.println();

		}

		//step 3
		for(int i=0;i<Math.ceil(1.*unitcount/teamcount);i++){
			List dayplan = (List<List>)plans.get(i); 
			List newunit = (List)dayplan.get(dayplan.size()-1);
			for(int p=1;p<ruler.size();p++){
				int diff = ruler.get(p)-1;
				List<List> newdays = (List<List>)plans.get(i+diff);
				newdays.add(0,newunit);
			}
			System.out.println();

		}

		//print
		for(int i=0;i<plans.size();i++){
			System.out.println("The "+(i+1)+"th day start!");
			List dayplan = (List)plans.get(i); 
			for(int j=0;j<dayplan.size();j++){
				String mark="*";
				if(j+1==dayplan.size()) mark="^";
				List unit = (List)dayplan.get(j);
				for(int k=0;k<unit.size();k++){
					System.out.print(mark+unit.get(k));
				}
				System.out.println();
			}
			System.out.println();

		}
		System.out.println("It is a Test ~ .");
	}
}


