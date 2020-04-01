package task_011;

public class Employee {
	private int id;
	private int tall;
	private int weight;
	private String enName;
	private String name;
	private String phone;
	private String email;
	private float bmi;
	
	public Employee(int id, int tall, int weight,String enName, String name, String phone, String email, float bmi){
		this.id = id;
		this.tall = tall;
		this.weight = weight;
		this.enName = enName;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.bmi = bmi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBmi() {
		return bmi;
	}
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", tall=" + tall + ", weight=" + weight + ", enName=" + enName + ", name=" + name
				+ ", phone=" + phone + ", email=" + email + ", bmi=" + bmi + "]";
	}
	
	
}
