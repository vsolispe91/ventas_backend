package pe.com.vsp.service;

import java.util.List;

import pe.com.vsp.repo.IGenericRepo;

public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID> {

	
	protected abstract IGenericRepo<T, ID> getRepo();
	
	@Override
	public T registrar(T t) throws Exception{
		// TODO Auto-generated method stub
		return getRepo().save(t);		
	}

	@Override
	public T modificar(T t)  throws Exception{
		return getRepo().save(t);
	}

	@Override
	public List<T> listar()  throws Exception{
		return getRepo().findAll();
	}

	@Override
	public T listarpodID(ID id)  throws Exception{
		return getRepo().findById(id).orElse(null);
	}

	@Override
	public void eliminar(ID id)  throws Exception{
		getRepo().deleteById(id);
	}

	
}
