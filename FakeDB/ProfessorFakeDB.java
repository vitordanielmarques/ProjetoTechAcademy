package FakeDB;

import java.util.ArrayList;

import Dominio.Professor;

public class ProfessorFakeDB extends AbsGenericFakeDB<Professor> {
    
    @Override
    protected void autoPreencher(){
        this.dados.add(new Professor(301, "Roberto Nunes", "3231", 5500.0));
        this.dados.add(new Professor(302, "Sandra Melo", "3232", 6200.0));
        this.dados.add(new Professor(303, "Felipe Costa", "3233", 4800.0));
        this.dados.add(new Professor(304, "Patrícia Lopes", "3234", 5900.0));
        this.dados.add(new Professor(305, "Gustavo Rocha", "3235", 5100.0));
    }

    public ProfessorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
