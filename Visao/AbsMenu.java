package Visao;

import java.util.Scanner;

public abstract class AbsMenu {

    protected Scanner scan;

    public abstract void executar();

    protected int exibirMenuPrincipal(String dominio){
        System.out.println("----- MENU PRINCIPAL [" + dominio + "] -----");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar Todos");
        System.out.println("3 - Buscar por Código");
        System.out.println("4 - Editar");
        System.out.println("5 - Excluir");
        System.out.println("9 - Sair");
        System.out.print("Selecione uma opção: ");
        return this.lerInt();
    }    

    protected void pausar(){
        System.out.println("Clique <ENTER> para continuar...");
        this.scan.nextLine();
    }

    protected int lerInt(){
    return this.converterInt(this.scan.nextLine(), -1);
    }

    protected int converterInt(String texto, int padrao){
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException e){
            return padrao;
        }
    }
    
    protected String perguntar(String rotulo, String atual){
        System.out.print(rotulo + " [" + atual + "]: ");
        String entrada = this.scan.nextLine().trim();
        return entrada.isEmpty() ? atual : entrada;
    }

    protected int perguntarInt(String rotulo, int atual){
        System.out.print(rotulo + " [" + atual + "]: ");
        String entrada = this.scan.nextLine().trim();
        return entrada.isEmpty() ? atual : this.converterInt(entrada, atual);
    }
}
