package br.com.company.modelproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.company.modelproject.model.CreateProduct;

public interface CreateProductRepository extends JpaRepository<CreateProduct, Long>{

}
