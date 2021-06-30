/*/ Classe de entidade./*/
package entities;

public class Apartament {

	private String name;
	private String email;

	/* / Construtor com nome e email. / */
	public Apartament(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/* /Funções gets e sets. / */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/* / Função toString / */
	public String toString() {

		return name + ", " + email;
	}

}
