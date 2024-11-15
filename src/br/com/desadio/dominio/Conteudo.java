package br.com.desadio.dominio;

public abstract class Conteudo {

   protected static final double XP_PADRAO = 10; // statico pode ser acessado fora da classe conteudo sendo protected nas classes filhas usado como herança.

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
