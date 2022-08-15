package br.com.company.modelproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor /*Constructor with parameters*/
@NoArgsConstructor	/*Constructor with no parameters*/
@Getter
public class CreateProduct {

private static final String SEQUENCE_CREATE_PRODUCT = "create_product_id_seq";
	
	@Id
	@SequenceGenerator(name = SEQUENCE_CREATE_PRODUCT, sequenceName = SEQUENCE_CREATE_PRODUCT, schema = "public", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_CREATE_PRODUCT)
	private Long id;
	private Feedstock feedstock;
	private Double quantityTotal;
	private Measurement unit;
	private Double value;
	
	
}
