package FakeDB;

import java.util.ArrayList;

import Dominio.Estagiario;

public class EstagiarioFakeDB extends AbsGenericFakeDB<Estagiario> {

    @Override
    protected void autoPreencher(){
        this.dados.add(new Estagiario(601, "Rafaela Dias", "6601", "rafaela@mail.com", "11922220001", "Rua E, 5", 1200.0, 30, "Desenvolvimento"));
        this.dados.add(new Estagiario(602, "Gabriel Matos", "6602", "gabriel@mail.com", "11922220002", "Rua F, 80", 1100.0, 20, "Suporte de TI"));
        this.dados.add(new Estagiario(603, "Letícia Moura", "6603", "leticia@mail.com", "11922220003", "Av. G, 150", 950.0, 25, "Administração"));
        this.dados.add(new Estagiario(604, "Rodrigo Pires", "6604", "rodrigo@mail.com", "11922220004", "Rua H, 61", 1300.0, 30, "Dados"));
    }

    public EstagiarioFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
