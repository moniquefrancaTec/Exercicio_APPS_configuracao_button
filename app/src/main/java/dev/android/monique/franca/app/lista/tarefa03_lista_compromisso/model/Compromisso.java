package dev.android.monique.franca.app.lista.tarefa03_lista_compromisso.model;

public class Compromisso {
    private String nomeCompromisso;
    private String dataCompromisso;
    private String horarioCompromisso;
    private String localCompromisso;

    public Compromisso() {
    }

    public Compromisso(String nomeCompromisso, String dataCompromisso, String horarioCompromisso, String localCompromisso) {
        this.nomeCompromisso = nomeCompromisso;
        this.dataCompromisso = dataCompromisso;
        this.horarioCompromisso = horarioCompromisso;
        this.localCompromisso = localCompromisso;
    }

    public String getNomeCompromisso() {
        return nomeCompromisso;
    }

    public void setNomeCompromisso(String nomeCompromisso) {
        this.nomeCompromisso = nomeCompromisso;
    }

    public String getDataCompromisso() {
        return dataCompromisso;
    }

    public void setDataCompromisso(String dataCompromisso) {
        this.dataCompromisso = dataCompromisso;
    }

    public String getHorarioCompromisso() {
        return horarioCompromisso;
    }

    public void setHorarioCompromisso(String horarioCompromisso) {
        this.horarioCompromisso = horarioCompromisso;
    }

    public String getLocalCompromisso() {
        return localCompromisso;
    }

    public void setLocalCompromisso(String localCompromisso) {
        this.localCompromisso = localCompromisso;
    }
}
