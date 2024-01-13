package com.projeto.jogoszerados.service;

import com.projeto.jogoszerados.model.Zerado;
import com.projeto.jogoszerados.repository.ZeradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZeradoService {

    @Autowired
    private ZeradoRepository zeradoRepository;

    public List<Zerado> findAll(){
        List<Zerado> zerados = zeradoRepository.findAll();
        return zerados;
    }

    public Zerado save(Zerado zerado){
        return zeradoRepository.save(zerado);
    }

    public void deleteById(Long id) {
        zeradoRepository.deleteById(id);
    }

    public Zerado update(Long id, Zerado zerado) {

        Zerado zeradoEntity = zeradoRepository.getReferenceById(id);

        zeradoEntity.setGenero(zerado.getGenero());
        zeradoEntity.setNome(zerado.getNome());
        zeradoEntity.setMinutosJogados(zerado.getMinutosJogados());
        zeradoEntity.setHorasJogadas(zerado.getHorasJogadas());
        zeradoEntity.setData(zerado.getData());
        zeradoEntity.setConsole(zerado.getConsole());
        zeradoEntity.setDificuldade(zerado.getDificuldade());
        zeradoEntity.setAvaliacao(zerado.getAvaliacao());

        return zeradoRepository.save(zeradoEntity);

    }
}
