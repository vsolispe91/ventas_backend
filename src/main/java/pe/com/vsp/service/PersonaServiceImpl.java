package pe.com.vsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.vsp.model.Persona;
import pe.com.vsp.repo.IGenericRepo;
import pe.com.vsp.repo.IPersonaRepo;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona,Integer> implements IPersonaService{

	
	@Autowired
	private IPersonaRepo repo;
	
	@Override
	protected IGenericRepo<Persona, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

}
