/**
 * 
 */
package br.ufpi.rony.sistema.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.ufpi.rony.sistema.model.common.Pessoa;

/**
 * @author Ronyerison
 *
 */
@Entity
@Table
public class Usuario extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String senha;
	
	public Usuario() {
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
