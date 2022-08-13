package br.com.company.modelproject.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter

public class Inventory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy = "inventory")
	private List<Product> products = new ArrayList<Product>();

	/*ANALIZAR ESTE MÉTODO*/
	public void addProduct(String product) {
			for (Product prod : products) {
				if(prod == null) {
					break;
				}else {
					this.products.add(prod);
				}
			}
		
	}
	
	
}
