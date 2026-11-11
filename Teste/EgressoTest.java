package Teste;

import Dominio.Egresso;
import Servico.EgressoServ;

public class EgressoTest {
    public static void main(String[] args) {
        EgressoServ srv = new EgressoServ();

        System.out.println("***** ORIGINAL *****");
        for (Egresso item : srv.listar()) {
            item.exibir();
        }

        System.out.println("\n***** ADICIONANDO *****");
        Egresso novo = new Egresso(0, "Teste Egresso", "99901", 2025, "ADS", "Desenvolvimento");
        srv.adicionar(novo);
        novo.exibir();

        System.out.println("\n***** BUSCANDO *****");
        Egresso busca = srv.buscar(novo.getCodigo());
        if (busca != null) busca.exibir();

        System.out.println("\n***** ALTERANDO *****");
        novo.setAreaAtuacao("Gestão");
        Egresso alterado = srv.editar(novo);
        alterado.exibir();

        System.out.println("\n***** EXCLUINDO *****");
        srv.excluir(alterado);

        System.out.println("\n***** APÓS EXCLUSÃO *****");
        for (Egresso item : srv.listar()) {
            item.exibir();
        }
    }
}
