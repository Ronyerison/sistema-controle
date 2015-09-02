/**
 * 
 */
package br.ufpi.rony.sistema.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.ufpi.rony.sistema.model.common.Endereco;
import br.ufpi.rony.sistema.model.common.Pessoa;

/**
 * @author Ronyerison
 *
 */
@Entity
@Table
public class Cliente extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="pessoa", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Endereco> endereco;
	
	@OneToMany(mappedBy="cliente", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Conta> contas;
	
	public Cliente() {
	}
	
	/**
	 * @return the endereco
	 */
	public List<Endereco> getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

}
