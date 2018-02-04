package minos.bean;

public class LabelT {
	private int id = 0;
	private String fr = "";
	private String nl = "";
	public LabelT(int id, String fr, String nl) {
		super();
		this.id = id;
		this.fr = fr;
		this.nl = nl;
	}
	
	public LabelT(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getNl() {
		return nl;
	}

	public void setNl(String nl) {
		this.nl = nl;
	};
	
	

}
