package assignment_2;


public class Electionparty {
	private int electionid;
	private String name;
	private String electiondate;
	private String district;
	private String constituency;
	private String countingdate;
	public int getElectionid() {
		return electionid;
	}
	public void setElectionid(int electionid) {
		this.electionid = electionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElectiondate() {
		return electiondate;
	}
	public void setElectiondate(String electiondate) {
		this.electiondate = electiondate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getCountingdate() {
		return countingdate;
	}
	public void setCountingdate(String countingdate) {
		this.countingdate = countingdate;
	}
	public Electionparty() {
		
		
	}
	public Electionparty(int electionid, String name, String electiondate, String district, String constituency,
			String countingdate) {
		
		this.electionid = electionid;
		this.name = name;
		this.electiondate = electiondate;
		this.district = district;
		this.constituency = constituency;
		this.countingdate = countingdate;
	}
	public int hashCode(){

		
		int code=0;
		code=electiondate.hashCode();
		return code;
		
	}
	public boolean equals(Object o){

		
		if(o instanceof Electionparty)
		{
			Electionparty e=(Electionparty)o;
			String name1=e.electiondate;
			String name2=this.getElectiondate();
			return (name1.equals(name2));
		}
		else
			return false;
	}
	
	
	
	
	

}
