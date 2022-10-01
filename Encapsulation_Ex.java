package Test1;

public class Encapsulation_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student E= new Student();
		E.setName("Akshay Gunjal");
		E.setAddress("Mumbai");
		E.setAge(24);
		E.setBlood_Group("B+ve");
		
		System.out.println("My name is: " + E.getName() + "\n" + "My address is: " + E.getAddress() + "\n" + "My age is: " + E.getAge() + "\n" + "My blood group is: " + E.getBlood_Group());

	}

}
//This is my local encapsulation method