package br.com.datamob.listas;

public class Model
{
    private int imagem;
    private String titulo;
    private String descricao;

    public Model(int imagem, String titulo, String descricao)
    {
        this.imagem = imagem;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Model()
    {
    }

    public int getImagem()
    {
        return imagem;
    }

    public void setImagem(int imagem)
    {
        this.imagem = imagem;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
}
