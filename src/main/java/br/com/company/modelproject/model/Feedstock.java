package br.com.company.modelproject.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
@Table(name = "Insumos(Feedstock)")
public class Feedstock implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String mark;
	@Enumerated(EnumType.STRING)
	private Measurement unit;
	private Double quantityPackage;
	private Double qtdeMedidaPcte;
	private Double unitaryValue;
	@ManyToOne
	private CustFinalProduct cfp;

	public Double quantityTotal() {
		return this.quantityPackage * this.qtdeMedidaPcte;
	}
	
	public Double valueTotal() {
		return this.quantityPackage * this.unitaryValue;
	}
	
	
}