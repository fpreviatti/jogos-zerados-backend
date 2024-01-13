package com.projeto.jogoszerados.test;

import com.projeto.jogoszerados.model.Zerado;
import com.projeto.jogoszerados.repository.ZeradoRepository;
import com.projeto.jogoszerados.service.ZeradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class Setup implements CommandLineRunner {

    @Autowired
    private ZeradoRepository zeradoRepository;

    @Autowired
    private ZeradoService zeradoService;

    Zerado zerado1 = new Zerado();

    @Override
    public void run(String... args) throws Exception {

//        zerado1.setAvaliacao("2");
//        zerado1.setConsole("Xbox");
//        zerado1.setData(new Date());
//        zerado1.setDificuldade("Dificil");
//        zerado1.setHorasJogadas(200);
//        zerado1.setMinutosJogados(50);
//        zerado1.setNome("Lego Star Wars");
//        zerado1.setGenero("Aventura");
//
//        zeradoService.save(zerado1);

       // usuarioService.save(usuario,null);

    }

}