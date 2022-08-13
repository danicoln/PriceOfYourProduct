package br.com.company.modelproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.company.modelproject.model.Product;
import br.com.company.modelproject.repository.ProductRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	/*CRUD*/
	
	/*method get all product*/
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	/*method get product by id*/
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Long id) {
	return productRepository.findById(id).get();
	}
	
	// Criar um método que atualiza o item.
	/*method update product by id*/ 
//	@Transactional
//	@PutMapping("/{id}")
//	public Product updateProductById(@PathVariable Long id, @RequestBody Product product) {
//		Optional<Product> optional = productRepository.findById(id);
//		if(optional.isPresent()) {
//			return productRepository.save(product);
//		}
//		return productRepository.getReferenceById(id);
//	}
	
	
	/*method save product*/
	@Transactional
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	/*method delete product*/
	@Transactional
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		Optional<Product> optional = productRepository.findById(id);
		if(optional.isPresent()){
			productRepository.deleteById(id);
			return ResponseEntity.ok().build();	
		}
		return ResponseEntity.notFound().build();
		
	}
	
}
