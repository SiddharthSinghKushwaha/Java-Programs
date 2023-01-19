//java bean for a person
class Person{
	private String firstName;
	private String lastName;
	public String getFristName(){
		return firstName;
	}
	public String getlastName(){
		return lastName;
	}
	public void setFirstName(String fn){
		firstName = fn;
	}
	public void setLastName(String ln){
		lastName = ln;
	}
}