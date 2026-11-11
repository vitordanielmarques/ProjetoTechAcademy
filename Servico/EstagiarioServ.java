package Servico;

import java.util.ArrayList;

import DAO.EstagiarioDAO;
import Dominio.Estagiario;

public class EstagiarioServ extends AbsGenericServ<Estagiario> {

    @Override
    public ArrayList<Estagiario> listar(){
        return this.dao.readAll();
    }

    @Override
    public Estagiario buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override
    public Estagiario editar(Estagiario alterado){
        return this.dao.update(alterado);
    }

    @Override
    public Estagiario adicionar(Estagiario novo){
        return this.dao.create(novo);
    }

    @Override
    public Estagiario excluir(Estagiario apagado){
        return this.dao.delete(apagado);
    }

    public EstagiarioServ(){
        this.dao = new EstagiarioDAO();
    }
}
