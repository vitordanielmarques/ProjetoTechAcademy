package FakeDB;

import java.util.ArrayList;

import Dominio.ProfessorEfetivo;

public class ProfessorEfetivoFakeDB extends AbsGenericFakeDB<ProfessorEfetivo> {
    
    @Override
    protected void autoPreencher(){
        this.dados.add(new ProfessorEfetivo(401, "Helena Prado", "4231", 7200.0, 1500.0));
        this.dados.add(new ProfessorEfetivo(402, "Luiz Augusto", "4232", 8100.0, 2100.0));
        this.dados.add(new ProfessorEfetivo(403, "Tânia Viana", "4233", 6900.0, 900.0));
        this.dados.add(new ProfessorEfetivo(404, "Marcelo Teles", "4234", 7800.0, 1800.0));
        this.dados.add(new ProfessorEfetivo(405, "Yara Campos", "4235", 7400.0, 1200.0));
    }

    public ProfessorEfetivoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
