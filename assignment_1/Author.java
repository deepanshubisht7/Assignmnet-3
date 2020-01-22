package assignment_1;

public class Author {
	private int authorId;
	private String name;
	private String address;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Author() {}
	public Author(int authorId, String name, String address) {
		
		this.authorId = authorId;
		this.name = name;
		this.address = address;
	}
	
	

}
