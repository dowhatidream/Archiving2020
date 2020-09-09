package db√≥∏Æ;

public class ProductVO {
	private int id;
	private String title;
	private int price;
	private String company;
	private String tel;

	public ProductVO() {
		super();
	}

	public ProductVO(int id, String title, int price, String company, String tel) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.company = company;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", title=" + title + ", price=" + price + ", company=" + company + ", tel=" + tel
				+ "]";
	}
}
