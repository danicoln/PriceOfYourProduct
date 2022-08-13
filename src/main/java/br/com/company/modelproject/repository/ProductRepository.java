package br.com.company.modelproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.company.modelproject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
