package br.com.company.modelproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Feedstock feedstock;
	private Double quantityTotal;
	private Measurement unit;
	private Double value;
	
//	public double unitaryValue() {
//		
//	}
}
