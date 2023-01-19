public class CreateJavaBean{
	public static void main(String[] args){
		Person p = new Person();
		p.setFirstName("Siddharth");
		p.setLastName("Singh");
		System.out.println("Java bean data: "+ p.getFristName() + " "+ p.getlastName());
	}
}