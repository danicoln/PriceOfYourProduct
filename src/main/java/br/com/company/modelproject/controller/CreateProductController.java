package br.com.company.modelproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.company.modelproject.model.CreateProduct;
import br.com.company.modelproject.repository.CreateProductRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/create")
public class CreateProductController {

	CreateProductRepository repository;

	/*CRUD*/
	
	/*method get all createProduct*/
	@GetMapping
	public List<CreateProduct> getAllCreateProduct(){
		return repository.findAll();
	}
	
	/*method get createProduct by id*/
	@GetMapping("/{id}")
	public CreateProduct getCreateProductById(@PathVariable Long id) {
	return repository.findById(id).get();
	}
	
	
	/*method save createProduct*/
	@Transactional
	@PostMapping
	public CreateProduct save(@RequestBody CreateProduct createProduct) {
		return repository.save(createProduct);
	}
	
	
	/*method delete createProduct*/
	@Transactional
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Optional<CreateProduct> optional = repository.findById(id);
		if(optional.isPresent()){
			repository.deleteById(id);
			return ResponseEntity.ok().build();	
		}
		return ResponseEntity.notFound().build();
		
	}
}
