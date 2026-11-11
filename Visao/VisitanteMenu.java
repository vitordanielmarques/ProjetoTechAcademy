package Visao;

import java.util.Scanner;

import Dominio.Visitante;
import Servico.VisitanteServ;
import Tools.Util;

public class VisitanteMenu extends AbsMenu {

    private VisitanteServ servico;

    @Override
    public void executar(){
        int opcao = 0;
        while (opcao != 9){
            System.out.println("\n\n");
            opcao = this.exibirMenuPrincipal("VISITANTE");
            switch (opcao){
                case 1:
                    this.cadastrar();
                    this.pausar();
                    break;
                case 2:
                    this.listar();
                    this.pausar();
                    break;
                case 3:
                    this.buscarPorCodigo();
                    this.pausar();
                    break;
                case 4:
                    this.editar();
                    this.pausar();
                    break;
                case 5:
                    this.excluir();
                    this.pausar();
                    break;
                case 9:
                    System.out.println("TCHAU");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    this.pausar();
                    break;
            }
            Util.limparTerminal();
        }
    }

    private void cadastrar(){
        System.out.println("\n***** CADASTRAR *****");
        System.out.print("Nome: ");
        String nome = this.scan.nextLine();
        System.out.print("CPF: ");
        String cpf = this.scan.nextLine();
        System.out.print("E-mail: ");
        String email = this.scan.nextLine();
        System.out.print("Telefone: ");
        String telefone = this.scan.nextLine();
        System.out.print("Endereço: ");
        String endereco = this.scan.nextLine();
        System.out.print("Motivo da visita: ");
        String motivo = this.scan.nextLine();
        System.out.print("Nº do crachá: ");
        int cracha = this.lerInt();
        System.out.print("Setor: ");
        String setor = this.scan.nextLine();

        Visitante novo = new Visitante(0, nome, cpf, email, telefone, endereco, motivo, cracha, setor);
        novo = this.servico.adicionar(novo);
        System.out.println("Cadastrado:");
        novo.exibir();
    }

    private void listar(){
        System.out.println("\n***** LISTAR TODOS *****");
        for (Visitante item : this.servico.listar()){
            item.exibir();
            System.out.println();
        }
    }

    private Visitante pesquisar(){
        System.out.print("Digite o código: ");
        int codigo = this.lerInt();
        Visitante visitante = this.servico.buscar(codigo);
        if (visitante == null){
            System.out.println("ERRO - código inválido");
        }
        return visitante;
    }

    private void buscarPorCodigo(){
        System.out.println("\n***** BUSCAR POR CÓDIGO *****");
        Visitante visitante = this.pesquisar();
        if (visitante != null){
            visitante.exibir();
        }
    }

    private void editar(){
        System.out.println("\n***** EDITAR *****");
        Visitante visitante = this.pesquisar();
        if (visitante == null){
            return;
        }
        visitante.exibir();
        System.out.println("Pressione Enter para manter o valor atual.");

        visitante.setNome(this.perguntar("Nome", visitante.getNome()));
        visitante.setCpf(this.perguntar("CPF", visitante.getCpf()));
        visitante.setEmail(this.perguntar("E-mail", visitante.getEmail()));
        visitante.setTelefone(this.perguntar("Telefone", visitante.getTelefone()));
        visitante.setEndereco(this.perguntar("Endereço", visitante.getEndereco()));
        visitante.setMotivoVisita(this.perguntar("Motivo da visita", visitante.getMotivoVisita()));
        visitante.setCrachaNumero(this.perguntarInt("Nº do crachá", visitante.getCrachaNumero()));
        visitante.setSetorVisita(this.perguntar("Setor", visitante.getSetorVisita()));

        Visitante alterado = this.servico.editar(visitante);
        if (alterado != null){
            System.out.println("Registro alterado:");
            alterado.exibir();
        }
    }

    private void excluir(){
        System.out.println("\n***** EXCLUIR *****");
        Visitante visitante = this.pesquisar();
        if (visitante == null){
            return;
        }
        visitante.exibir();
        System.out.print("Confirma exclusão (1-Sim / 2-Não)? ");
        if (this.lerInt() == 1){
            Visitante apagado = this.servico.excluir(visitante);
            if (apagado != null){
                System.out.println("Registro excluído.");
            }
        }
    }

    private String perguntar(String rotulo, String atual){
        System.out.print(rotulo + " [" + atual + "]: ");
        String entrada = this.scan.nextLine().trim();
        return entrada.isEmpty() ? atual : entrada;
    }

    private int perguntarInt(String rotulo, int atual){
        System.out.print(rotulo + " [" + atual + "]: ");
        String entrada = this.scan.nextLine().trim();
        return entrada.isEmpty() ? atual : this.converterInt(entrada, atual);
    }        

    public VisitanteMenu(){
        this.servico = new VisitanteServ();
        this.scan = new Scanner(System.in);
    }
}
