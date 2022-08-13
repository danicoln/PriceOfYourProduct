package br.com.company.modelproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Cost {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long valueUnitary;
	private Long quantity;
	@Enumerated(EnumType.STRING)
	private Measurement unit;

	public Long costTotal() {
		return this.valueUnitary * this.quantity;
	}
	
}
