package br.com.company.modelproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.company.modelproject.model.Feedstock;

public interface FeedstockRepository extends JpaRepository<Feedstock, Long>{

}
