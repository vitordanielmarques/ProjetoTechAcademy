package DAO;

import Dominio.Professor;
import FakeDB.ProfessorFakeDB;

public class ProfessorDAO extends AbsGenericDAO<Professor> {

    @Override
    public Professor create(Professor novo) {
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1; //recurso do auto incremento. soma 1.
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo); //adiciona o novo professor no repositório
        return novo; //devolve o novo registro com o código atualizado
    }

    @Override
    public Professor delete(Professor apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Professor readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Professor update(Professor alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    public ProfessorDAO() {
        this.repositorio = new ProfessorFakeDB().getDados();
    }
}
