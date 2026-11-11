package FakeDB;

import java.util.ArrayList;

import Dominio.Egresso;

public class EgressoFakeDB extends AbsGenericFakeDB<Egresso> {

    @Override
    protected void autoPreencher(){
        this.dados.add(new Egresso(701, "Bruno Teixeira", "7701", 2022, "Análise e Desenvolvimento de Sistemas", "Desenvolvimento Web"));
        this.dados.add(new Egresso(702, "Camila Rocha", "7702", 2023, "Engenharia de Software", "Qualidade de Software"));
        this.dados.add(new Egresso(703, "Thiago Sales", "7703", 2021, "Ciência da Computação", "Infraestrutura"));
        this.dados.add(new Egresso(704, "Renata Amaral", "7704", 2024, "Sistemas de Informação", "Dados e Analytics"));
    }

    public EgressoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
