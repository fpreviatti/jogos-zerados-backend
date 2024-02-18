package com.projeto.jogoszerados.repository;

import com.projeto.jogoszerados.model.Imagem;
import com.projeto.jogoszerados.model.Zerado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Long> {

//    @Query(
//            value = "SELECT * FROM ZERADO z WHERE z.id_user = ?1",
//            nativeQuery = true)
//    public List<Zerado> findZeradosByIdUsuario(Long id);

}
