public class Armas {
    private String nome;
    private String cor;
    private String TipoArmas;
    private int duracao;
    private int dano;
    private int defesa;
    private String funcao;
    private String requisitos;
    private int alcance;
    private double valorTroca;

    public Armas(String nome, String cor, String TipoArmas, int duracao, int dano, int defesa,
                String funcao, String requisitos, int alcance, double valorTroca){
        this.nome = nome;
        this.cor = cor;
        this.TipoArmas = TipoArmas;
        this.duracao = duracao;
        this.dano = dano;
        this.defesa = defesa;
        this.funcao = funcao;
        this.requisitos = requisitos;
        this.alcance = alcance;
        this.valorTroca = valorTroca;
        
    }

    // Métodos getters e setters para cada atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getTipoArmas() {
        return TipoArmas;
    }

    public void setTipo( String TipoArmas) {
        this.TipoArmas = TipoArmas;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public double getValorTroca() {
        return valorTroca;
    }

    public void setValorTroca(double valorTroca) {
        this.valorTroca = valorTroca;
    }

    // Outros métodos da classe

    public void Espada_Poderosa(int danoPersonagem, int danoEspada){
        danoPersonagem += danoEspada;
        System.out.println("Você comprou a espada!");
    }

    public void cajado_mistico(int danoPersonagem, int danocajado){
        danoPersonagem += danocajado;
        System.out.println("Você comprou o cajado");
    }
    
    public void adagas_sombrias(int danoPersonagem, int danoadaga){
        danoPersonagem += danoadaga;
        System.out.println("Você comprou a adaga");
    }

    public void luvas_sagradas(int danoPersonagem, int danoluvas){
        danoPersonagem += danoluvas;
        System.out.println("Você comprou as luvas sagradas ");
    }

    public void besta_poderosa(int danoPersonagem, int danobesta){
        danoPersonagem += danobesta;
        System.out.println("Você comprou a besta sagrada ");
    }

    public void arco_elfico(int danoPersonagem, int danoarco){
        danoPersonagem += danoarco;
        System.out.println("Você comprou o arco elfico ");
    }

    public void machado_brutal(int danoPersonagem, int danomachado){
        danoPersonagem += danomachado;
        System.out.println("Você comprou o machado brutal ");
    }

    public void chinelo_Da_Mae(int danoPersonagem, int danochinelo){
        danoPersonagem += danochinelo;
        System.out.println("Você comprou o chinelo da mãe ");
    }

    public void lança(int danoPersonagem, int danolança){
        danoPersonagem += danolança;
        System.out.println("Você comprou uma lança ");
    }

    public void faca(int danoPersonagem, int danofaca){
        danoPersonagem += danofaca;
        System.out.println("Você comprou uma faca ");
    }
}
