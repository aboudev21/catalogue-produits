package org.aboudev21.webapp.metier;

import java.util.List;

import org.aboudev21.webapp.dao.ICatalogueDAO;
import org.aboudev21.webapp.dao.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CatalogueMetierImpl implements ICAtalogueMetier {

	private ICatalogueDAO dao;
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;		
	}

	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		return dao.getProduitsParMC(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		return dao.getProduit(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
	}

}
