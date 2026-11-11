package Servico;

import java.util.ArrayList;

import DAO.VisitanteDAO;
import Dominio.Visitante;

public class VisitanteServ extends AbsGenericServ<Visitante> {

    @Override
    public ArrayList<Visitante> listar(){
        return this.dao.readAll();
    }

    @Override
    public Visitante buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override
    public Visitante editar(Visitante alterado){
        return this.dao.update(alterado);
    }

    @Override
    public Visitante adicionar(Visitante novo){
        return this.dao.create(novo);
    }

    @Override
    public Visitante excluir(Visitante apagado){
        return this.dao.delete(apagado);
    }

    public VisitanteServ(){
        this.dao = new VisitanteDAO();
    }
}
