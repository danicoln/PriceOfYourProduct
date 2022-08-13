package br.com.company.modelproject.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor /*Constructor with parameters*/
@NoArgsConstructor	/*Constructor with no parameters*/
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String SEQUENCE_PRODUCT = "product_id_seq";
	
	@Id
	@SequenceGenerator(name = SEQUENCE_PRODUCT, sequenceName = SEQUENCE_PRODUCT, schema = "public", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_PRODUCT)
	private Integer id;
	private String name;
	private Double price;
	private Double quantity;
	@ManyToOne
	private Inventory inventory;

	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Double getQuantity() {
		return quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

}
