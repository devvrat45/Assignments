package jdbc;

public class Role {

	protected int roleno;
	protected String name;
	protected String priv;
	public Role(int roleno, String name, String priv) {
		super();
		this.roleno = roleno;
		this.name = name;
		this.priv = priv;
	}
	public int getRoleno() {
		return roleno;
	}
	public void setRoleno(int roleno) {
		this.roleno = roleno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriv() {
		return priv;
	}
	public void setPriv(String privalage) {
		this.priv = priv;
	}
	@Override
	public String toString() {
		return "Role [roleno=" + roleno + ", name=" + name + ", priv=" + priv + "]";
	}
	
	
	
}
