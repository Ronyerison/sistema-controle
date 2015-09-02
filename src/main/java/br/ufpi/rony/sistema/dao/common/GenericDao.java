/**
 * 
 */
package br.ufpi.rony.sistema.dao.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author Ronyerison
 *
 */
public class GenericDao<T> {
	
	@PersistenceContext
	private EntityManager em;
	
	private final Class<T> classe;

	/**
	 * @param classe
	 */
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	public void persist(T t){
		em.persist(t);
	}
	
	public void remove(T t){
		em.remove(em.merge(t));
	}
	
	public T update(T t){
		return em.merge(t);
	}
	
	public List<T> listAll(){
		@SuppressWarnings("unchecked")
		CriteriaQuery<T> query = (CriteriaQuery<T>) em.getCriteriaBuilder().createCriteriaDelete(this.classe);
		query.select(query.from(this.classe));
		
		List<T> lista = em.createQuery(query).getResultList();
		return lista;
	}
	
	public T findById(Long id){
		T instancia = em.find(this.classe, id);
		return instancia;
	}
}
