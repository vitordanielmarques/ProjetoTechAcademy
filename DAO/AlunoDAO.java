package DAO;

import Dominio.Aluno;
import FakeDB.AlunoFakeDB;

public class AlunoDAO extends AbsGenericDAO<Aluno> {
    //para criar um novo registro, precisamos pegar o último código do repositório e somar 1.
    @Override
    public Aluno create(Aluno novo) {
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1; //recurso do auto incremento. soma 1.
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo); //adiciona o novo aluno no repositório
        return novo; //devolve o novo registro com o código atualizado
    }
    //
    @Override
    public Aluno delete(Aluno apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aluno update(Aluno alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    public AlunoDAO() {
        this.repositorio = new AlunoFakeDB().getDados();
    }
}
