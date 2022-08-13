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

import br.com.company.modelproject.model.Feedstock;
import br.com.company.modelproject.repository.FeedstockRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/feedstock")
public class FeedstockController {

	@Autowired
	private FeedstockRepository repository;
	
	/*CRUD*/
	
	/*method get all feedStock*/
	@GetMapping
	public List<Feedstock> getAllFeedstock(){
		return repository.findAll();
	}
	
	/*method get feedStock by id*/
	@GetMapping("/{id}")
	public Feedstock getFeedstockById(@PathVariable Long id) {
	return repository.findById(id).get();
	}
	
	
	/*method save feedStock*/
	@Transactional
	@PostMapping
	public Feedstock save(@RequestBody Feedstock feedstock) {
		return repository.save(feedstock);
	}
	
	/*method delete feedStock*/
	@Transactional
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		Optional<Feedstock> optional = repository.findById(id);
		if(optional.isPresent()){
			repository.deleteById(id);
			return ResponseEntity.ok().build();	
		}
		return ResponseEntity.notFound().build();
		
	}
}
