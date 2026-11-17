package Dominio;

public abstract class AbsIdentificador {
    //Atributos
    protected int codigo;
    //propiedades
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Contrutor vazio.
    public AbsIdentificador(){}
    //Construtor recebe codigo como parametro.
    public AbsIdentificador(int codigo){
        this.codigo = codigo;
    }
}
