package pe.com.vsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.vsp.model.Producto;
import pe.com.vsp.repo.IGenericRepo;
import pe.com.vsp.repo.IProductoRepo;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto,Integer> implements IProductoService {

	@Autowired
	private IProductoRepo repo;
	
	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

	
	
}
