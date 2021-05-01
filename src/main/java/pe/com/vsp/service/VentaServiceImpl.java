package pe.com.vsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.vsp.model.Venta;
import pe.com.vsp.repo.IGenericRepo;
import pe.com.vsp.repo.IVentaRepo;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta,Integer> implements IVentaService{

	@Autowired
	private IVentaRepo repo;
	
	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

}
