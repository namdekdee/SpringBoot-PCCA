package th.co.pt.pcca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class TestModel {

	String name;
	String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
