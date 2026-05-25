import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
    private String email;
    private long ephone;
    private String address;
    
    public Employee() {
    }
    
    Employee(int eid , String ename ,String email , long ephone , String address ){
    	this.eid=eid;
    	this.ename=ename;
    	this.email=email;
    	this.ephone=ephone;
    	this.address=address;
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

	
   


}
