package PojoClasses;

public class player {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	private String name;
	private String country;
	private String role;
	public String getPriceincrores() {
		return priceincrores;
	}
	public void setPriceincrores(String priceincrores) {
		this.priceincrores = priceincrores;
	}

	private String priceincrores;
}
