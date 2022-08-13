package br.com.company.modelproject.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* Esta classe precisa ainda ser desenvolvida */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustFinalProduct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	private Long totalQuantity;
	private Feedstock feedstock;

}
