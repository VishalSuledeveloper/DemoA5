package net.MavelA5.DemoA5;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "myaddress")

public class address {
	
	@Id
	private int addressid;
	private String firstaddress;
	private String secondaddress;
	
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getFirstaddress() {
		return firstaddress;
	}
	public void setFirstaddress(String firstaddress) {
		this.firstaddress = firstaddress;
	}
	public String getSecondaddress() {
		return secondaddress;
	}
	public void setSecondaddress(String secondaddress) {
		this.secondaddress = secondaddress;
	}
	
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
