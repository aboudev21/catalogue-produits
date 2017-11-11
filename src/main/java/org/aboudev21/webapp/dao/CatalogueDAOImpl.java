package org.aboudev21.webapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

public class CatalogueDAOImpl implements ICatalogueDAO {

	Logger logger = Logger.getLogger(CatalogueDAOImpl.class);
	Map<String, Produit> produits = new HashMap<String, Produit>();
	
	@Override
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> getAllProduits() {
		Collection prods = produits.values(); 
		return new ArrayList<Produit>(prods);
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p : produits.values())
			if (p.getDesignation().indexOf(mc) >= 0) 
				prods.add(p);
		return prods;
	}

	@Override
	public Produit getProduit(String ref) {
		return produits.get(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		produits.remove(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
	}
	
	public void init(){
		logger.info("Initialisation du catalogue des produits");
		addProduit(new Produit("HP 565", "Ordinateur HP 565", 600, 20));
		addProduit(new Produit("Brother 132", "Imprimante", 200, 15));
		addProduit(new Produit("iPhone 7 Plus", "Smartphone ", 800, 10));
	}

}
