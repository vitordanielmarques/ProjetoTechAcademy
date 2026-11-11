package Servico;

import java.util.ArrayList;

import DAO.EgressoDAO;
import Dominio.Egresso;

public class EgressoServ extends AbsGenericServ<Egresso> {

    @Override
    public ArrayList<Egresso> listar(){
        return this.dao.readAll();
    }

    @Override
    public Egresso buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override
    public Egresso editar(Egresso alterado){
        return this.dao.update(alterado);
    }

    @Override
    public Egresso adicionar(Egresso novo){
        return this.dao.create(novo);
    }

    @Override
    public Egresso excluir(Egresso apagado){
        return this.dao.delete(apagado);
    }

    public EgressoServ(){
        this.dao = new EgressoDAO();
    }
}
