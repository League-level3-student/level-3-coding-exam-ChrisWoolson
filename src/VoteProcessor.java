import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> array) {
		int pope = 0;
				int ed = 0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equalsIgnoreCase("pope francis")) {
				
				pope++;
				
			} else {
				ed++;
			}
				
		}
		
		if(pope>ed) {
			return "pope francis";
		} else if(ed>pope){
			return "edward snowden";
		}else {
			return "TIE";
		}
		
		
		
		
	}
	
	
	
	
}
