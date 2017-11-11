package org.aboudev21.webapp.metier;

import java.util.List;

import org.aboudev21.webapp.dao.Produit;

public interface ICAtalogueMetier {

	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
	
}
