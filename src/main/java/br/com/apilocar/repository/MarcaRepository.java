package br.com.apilocar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apilocar.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long>{

}
