package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDAO;
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(int periodo){
		
		return this.corsoDAO.getCorsiByPeriod(periodo);
	}
	
	public Map<Corso, Integer> getIscritti(int periodo){
		return this.corsoDAO.getIscritti(periodo);
	}
}
