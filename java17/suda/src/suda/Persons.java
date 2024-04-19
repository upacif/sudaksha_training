package suda;

public class Persons {
	private int code;
	private String name;
	
	
	public Persons() {
		super();
	}


	public Persons(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Persons [code=" + code + ", name=" + name + "]";
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
