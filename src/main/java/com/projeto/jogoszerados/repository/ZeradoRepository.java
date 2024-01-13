package com.projeto.jogoszerados.repository;


import com.projeto.jogoszerados.model.Zerado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZeradoRepository extends JpaRepository<Zerado, Long> {


}
