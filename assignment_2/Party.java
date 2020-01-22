package assignment_2;

import java.util.*;



public class Party {
	public static void main(String[] args) {
		TreeMap<String, Electionparty> party = new TreeMap<String, Electionparty>();
		party.put("congress", new Electionparty(1,"congress","27/1/20","bhiwadi","leo","1/9/20"));
		party.put("BJP", new Electionparty(2,"BJP","2/1/20","karol bagh","mef","6/3/20"));
		party.put("aap", new Electionparty(3,"aap","7/4/20","kasol","jef","17/11/20"));
		party.put("hathi", new Electionparty(4,"hathi","4/4/20","jaipur","try","22/10/20"));
		party.put("saap", new Electionparty(5,"saap","27/1/20","kharadi","leo","1/9/20"));
		Set<String> keys = party.keySet();
	    String object, object1;
		
		
		
		for(Map.Entry<String, Electionparty> m: party.entrySet()) {
			object=m.getValue().getElectiondate();
			int count=0;
			//System.out.println(object);
			
			for(Map.Entry<String, Electionparty> n: party.entrySet()) {
				
					object1=n.getValue().getElectiondate();
					//System.out.println(object1);
					if(object.equals(object1)) {
						
						if(count>0)
							System.out.println(" Electionid "+m.getValue().getElectionid()+" name "+m.getValue().getName()+" election date "+m.getValue().getElectiondate()+" district "+m.getValue().getDistrict()+" constituency "+m.getValue().getConstituency()+" counting date "+m.getValue().getCountingdate());
						count+=1;
					}
					
				
			}
				
						
			
		}
		
		
		
	}

}
