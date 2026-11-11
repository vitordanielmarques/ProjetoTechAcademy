package FakeDB;

import java.util.ArrayList;

import Dominio.Visitante;

public class VisitanteFakeDB extends AbsGenericFakeDB<Visitante> {

    @Override
    protected void autoPreencher(){
        this.dados.add(new Visitante(501, "Carlos Nunes", "5501", "carlos@mail.com", "11911110001", "Rua A, 10", "Entrega de documentos", 1, "Secretaria"));
        this.dados.add(new Visitante(502, "Juliana Prado", "5502", "juliana@mail.com", "11911110002", "Rua B, 22", "Reunião com coordenação", 2, "Coordenação"));
        this.dados.add(new Visitante(503, "Marcos Vidal", "5503", "marcos@mail.com", "11911110003", "Av. C, 300", "Entrevista de emprego", 3, "Recursos Humanos"));
        this.dados.add(new Visitante(504, "Patrícia Souza", "5504", "patricia@mail.com", "11911110004", "Rua D, 45", "Palestra", 4, "Auditório"));
    }

    public VisitanteFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
