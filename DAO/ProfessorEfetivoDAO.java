package DAO;

import Dominio.ProfessorEfetivo;
import FakeDB.ProfessorEfetivoFakeDB;

public class ProfessorEfetivoDAO extends AbsGenericDAO<ProfessorEfetivo> {

    @Override
    public ProfessorEfetivo create(ProfessorEfetivo novo) {
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1; //recurso do auto incremento. soma 1.
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo); //adiciona o novo professor efetivo no repositório
        return novo; //devolve o novo registro com o código atualizado
    }

    @Override
    public ProfessorEfetivo delete(ProfessorEfetivo apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfessorEfetivo readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfessorEfetivo update(ProfessorEfetivo alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    public ProfessorEfetivoDAO() {
        this.repositorio = new ProfessorEfetivoFakeDB().getDados();
    }
}
