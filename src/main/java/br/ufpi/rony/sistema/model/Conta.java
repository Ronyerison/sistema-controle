/**
 * 
 */
package br.ufpi.rony.sistema.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Ronyerison
 *
 */
@Entity
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private Cliente cliente;
	
	private Double totalAPagar;
	
	@OneToMany(mappedBy="conta", cascade=CascadeType.ALL)
	private List<Pagamento> pagamentos;

	public Conta() {
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the totalAPagar
	 */
	public Double getTotalAPagar() {
		return totalAPagar;
	}

	/**
	 * @param totalAPagar the totalAPagar to set
	 */
	public void setTotalAPagar(Double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	/**
	 * @return the pagamentos
	 */
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	/**
	 * @param pagamentos the pagamentos to set
	 */
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	
}
