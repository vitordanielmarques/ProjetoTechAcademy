package Dominio;

public abstract class AbsPessoa extends AbsIdentificador {
    //Atributos
    protected String nome;
    protected String cpf;
    //Propiedades
    public String getNome(){
        return this.nome;
    }

    public void setNome(String valor){
        this.nome = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //Métodos
    public abstract void exibir();
    //Construtores
    public AbsPessoa(){}
    //Este segundo contrutor tem que ter os atributos da classe.
    public AbsPessoa(int codigo, String nome, String cpf){
        super(codigo);
        this.nome = nome;
        this.cpf = cpf;
    }
}