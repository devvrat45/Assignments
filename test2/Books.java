package test2;

public class Books {
	protected int isbn;
	protected String title;
	protected int pages;
	protected String pub_year;
	protected String type;
	protected Author auth;
	protected Publisher pub;
	public Books(int isbn, String title, int pages, String pub_year, String type, Author auth, Publisher pub) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.pub_year = pub_year;
		this.type = type;
		this.auth = auth;
		this.pub = pub;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPub_year() {
		return pub_year;
	}
	public void setPub_year(String pub_year) {
		this.pub_year = pub_year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	public Publisher getPub() {
		return pub;
	}
	public void setPub(Publisher pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", pages=" + pages + ", pub_year=" + pub_year + ", type="
				+ type + ", auth=" + auth + ", pub=" + pub + "]";
	}
	
}
