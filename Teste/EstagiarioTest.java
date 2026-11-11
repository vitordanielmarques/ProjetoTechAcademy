package Teste;

import Dominio.Estagiario;
import Servico.EstagiarioServ;

public class EstagiarioTest {
    public static void main(String[] args) {
        EstagiarioServ srv = new EstagiarioServ();

        System.out.println("***** ORIGINAL *****");
        for (Estagiario item : srv.listar()) {
            item.exibir();
        }

        System.out.println("\n***** ADICIONANDO *****");
        Estagiario novo = new Estagiario(0, "Teste Estagiário", "99903", "estagio@mail.com", "11988880000", "Rua Teste, 2", 1000.0, 20, "Testes");
        srv.adicionar(novo);
        novo.exibir();

        System.out.println("\n***** BUSCANDO *****");
        Estagiario busca = srv.buscar(novo.getCodigo());
        if (busca != null) busca.exibir();

        System.out.println("\n***** ALTERANDO *****");
        novo.setValorBolsa(1150.0);
        Estagiario alterado = srv.editar(novo);
        alterado.exibir();

        System.out.println("\n***** EXCLUINDO *****");
        srv.excluir(alterado);

        System.out.println("\n***** APÓS EXCLUSÃO *****");
        for (Estagiario item : srv.listar()) {
            item.exibir();
        }
    }
}
