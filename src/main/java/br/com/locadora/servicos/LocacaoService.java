package br.com.locadora.servicos;

import java.util.Date;

import br.com.locadora.entidades.Locacao;
import br.com.locadora.entidades.Filme;
import br.com.locadora.entidades.Usuario;
import br.com.locadora.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import static br.com.locadora.utils.DataUtils.adicionarDias;


public class LocacaoService {

    public Locacao alugarFilme(Usuario usuario, Filme filme) {
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return locacao;
    }
}
