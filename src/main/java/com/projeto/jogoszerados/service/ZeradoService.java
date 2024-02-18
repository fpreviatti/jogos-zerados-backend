package com.projeto.jogoszerados.service;

import com.projeto.jogoszerados.model.Imagem;
import com.projeto.jogoszerados.model.User;
import com.projeto.jogoszerados.model.Zerado;
import com.projeto.jogoszerados.repository.ImagemRepository;
import com.projeto.jogoszerados.repository.UserRepository;
import com.projeto.jogoszerados.repository.ZeradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZeradoService {

    @Autowired
    private ZeradoRepository zeradoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ImagemRepository imagemRepository;

    public List<Zerado> findZeradosByIdUsuario(Long id){
        List<Zerado> zerados = zeradoRepository.findZeradosByIdUsuario(id);
        return zerados;
    }

    public Zerado save(Zerado zerado, Long id){

        Optional<User> user = userRepository.findById(id);

            if (user != null) {

                zerado.setUser(user.get());
                //validar com o jwt e impedir que usuário salve no perfil de outra pessoa, ver roles


                if(zerado.getUrlImagemZeramento()!=null){

                    Imagem imagem = new Imagem();

                    imagem.setZerado(zerado);

                    imagem.setUrlImagem(zerado.getUrlImagemZeramento());

                    imagem.setImagemZeramento(true);

                    imagemRepository.save(imagem);

                    //persiste a imagem de zeramento
                }


                return zeradoRepository.save(zerado);
            }

            else{
                return null;
            }

    }

    public void deleteById(Long id) {
        zeradoRepository.deleteById(id);
    }

    public Zerado update(Long id, Zerado zerado) {

        Zerado zeradoEntity = zeradoRepository.getReferenceById(id);

        if(zerado.getUrlImagemZeramento()!=null){

            Imagem imagem = new Imagem();

            imagem.setZerado(zeradoEntity);

            imagem.setUrlImagem(zerado.getUrlImagemZeramento());

            imagem.setImagemZeramento(true);

            imagemRepository.save(imagem);

            //persiste a imagem de zeramento
        }

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
