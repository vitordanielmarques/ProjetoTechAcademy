package Dominio;

public class Colaborador extends AbsPessoa {
    //Atributos
    private String cargo;
    //Propiedades
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //Métodos
    @Override
    public void exibir(){
        System.out.println("[Colaborador] Código: " + this.codigo);
        System.out.print("Nome: " + this.nome);
        System.out.print(" | CPF: " + this.cpf);
        System.out.println("| Cargo: " + this.cargo);
    }
    //Construtores
    public Colaborador(){}

    public Colaborador(int codigo, String nome, String cpf, String cargo){
        super(codigo, nome, cpf);
        this.cargo = cargo;
    }
}
