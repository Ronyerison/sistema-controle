/**
 * 
 */
package br.ufpi.rony.sistema.dao;

import javax.ejb.Stateless;

import br.ufpi.rony.sistema.dao.common.GenericDao;
import br.ufpi.rony.sistema.model.Usuario;

/**
 * @author Ronyerison
 *
 */
@Stateless
public class UsuarioDao extends GenericDao<Usuario>{

	public UsuarioDao() {
		super(Usuario.class);
	}

}
