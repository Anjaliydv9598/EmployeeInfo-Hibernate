import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeedetail")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
    private String email;
    private int age;                  
    private double salary; 
    private long ephone;
    private String address;
    private boolean isActive;          // true/false
    private char gender;  
    
    public Employee() {
    }

	public Employee(int eid, String ename, String email, int age, double salary, long ephone, String address,
			boolean isActive, char gender) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.age = age;
		this.salary = salary;
		this.ephone = ephone;
		this.address = address;
		this.isActive = isActive;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}





	
   


}
