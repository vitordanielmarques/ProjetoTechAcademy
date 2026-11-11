package Teste;

import Dominio.Visitante;
import Servico.VisitanteServ;

public class VisitanteTest {
    public static void main(String[] args) {
        VisitanteServ srv = new VisitanteServ();

        System.out.println("***** ORIGINAL *****");
        for (Visitante item : srv.listar()) {
            item.exibir();
        }

        System.out.println("\n***** ADICIONANDO *****");
        Visitante novo = new Visitante(0, "Teste Visitante", "99902", "teste@mail.com", "11999990000", "Rua Teste, 1", "Teste", 9, "TI");
        srv.adicionar(novo);
        novo.exibir();

        System.out.println("\n***** BUSCANDO *****");
        Visitante busca = srv.buscar(novo.getCodigo());
        if (busca != null) busca.exibir();

        System.out.println("\n***** ALTERANDO *****");
        novo.setSetorVisita("Financeiro");
        Visitante alterado = srv.editar(novo);
        alterado.exibir();

        System.out.println("\n***** EXCLUINDO *****");
        srv.excluir(alterado);

        System.out.println("\n***** APÓS EXCLUSÃO *****");
        for (Visitante item : srv.listar()) {
            item.exibir();
        }
    }
}
