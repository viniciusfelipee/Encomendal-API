package com.coconutti.encomendal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coconutti.encomendal.domain.Consumidor;

@Repository
public interface ConsumidorRepository extends JpaRepository<Consumidor, Integer> {

}