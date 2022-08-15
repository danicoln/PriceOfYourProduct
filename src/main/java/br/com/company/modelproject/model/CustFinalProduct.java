package br.com.company.modelproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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
public class CustFinalProduct {
private static final String SEQUENCE_CUST_FINAL_PRODUCT = "cust_final_product_id_seq";
	
	@Id
	@SequenceGenerator(name = SEQUENCE_CUST_FINAL_PRODUCT , sequenceName = SEQUENCE_CUST_FINAL_PRODUCT , schema = "public", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_CUST_FINAL_PRODUCT )
	private Long id;
	private String name;
	private String description;
	private Long totalQuantity;
	@OneToOne
	private Product product;

}