package FirstHibernate.tn.ex.CRUDS;

public class User {

	private int idUser;
	private String nameUser;
	private String surnameUser;

	public User(int idUser, String nameUser, String surnameUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.surnameUser = surnameUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}

}
