package org.aboudev21.webapp.controllers;

import javax.validation.Valid;

import org.aboudev21.webapp.dao.Produit;
import org.aboudev21.webapp.metier.ICAtalogueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatalogueController {

	@Autowired
	private ICAtalogueMetier metier;
	
	@RequestMapping(value="/index")
	public String index( Model model){
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", metier.getAllProduits());
		return "produits";
	}
	
	@RequestMapping(value="/saveProduit")
	public String saveProduit(@Valid Produit p , BindingResult bindingResult, Model model){
		if (bindingResult.hasErrors()) {
			model.addAttribute("produits", metier.getAllProduits());
			return "produits";
		}
		metier.addProduit(p);
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", metier.getAllProduits());
		return "produits";
	}
	
}
