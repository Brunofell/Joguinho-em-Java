public abstract class Quest {
    private int id;
    private String nome;
    private String tipo;
    private String descricao;

    public Quest(int id, String nome, String tipo, String descricao){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public abstract void mostraMissao(String nome,String tipo, String descricao, Jogo jogo);

    public void setDescricao(String nome) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
