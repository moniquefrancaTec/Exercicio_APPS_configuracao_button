package dev.android.monique.franca.app.lista.tarefa01_lista_tarefas.model;

public class Tarefa {
    private String tituloTarefa;
    private String descricaoTarefa;
    private String dataTarefa;

    public  Tarefa(){

    }

    public Tarefa(String tituloTarefa, String descricaoTarefa, String dataTarefa) {
        this.tituloTarefa = tituloTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.dataTarefa = dataTarefa;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }
}
