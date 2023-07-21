public class Armadura {
    private String capacete;
    private String peitorais;
    private String braceletes;
    private String luvas;
    private String calcas;
    private String botas;

    public Armadura(String capacete, String peitorais, String braceletes, String luvas, String calcas, String botas) {
        this.capacete = capacete;
        this.peitorais = peitorais;
        this.braceletes = braceletes;
        this.luvas = luvas;
        this.calcas = calcas;
        this.botas = botas;
    }

    // Métodos getters e setters para cada atributo

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getPeitorais() {
        return peitorais;
    }

    public void setPeitorais(String peitorais) {
        this.peitorais = peitorais;
    }

    public String getBraceletes() {
        return braceletes;
    }

    public void setBraceletes(String braceletes) {
        this.braceletes = braceletes;
    }

    public String getLuvas() {
        return luvas;
    }

    public void setLuvas(String luvas) {
        this.luvas = luvas;
    }

    public String getCalcas() {
        return calcas;
    }

    public void setCalcas(String calcas) {
        this.calcas = calcas;
    }

    public String getBotas() {
        return botas;
    }

    public void setBotas(String botas) {
        this.botas = botas;
    }

    public void peitorais(int vidaPersonagem, int vidapeitoral){
        vidaPersonagem += vidapeitoral;
        System.out.println("Você comprou um peitoral!");
    }

    public void capacete(int vidaPersonagem, int vidacapacete){
        vidaPersonagem += vidacapacete;
        System.out.println("Você comprou um capacete!");
    }

    public void braceletes(int vidaPersonagem, int vidabracelete){
        vidaPersonagem += vidabracelete;
        System.out.println("Você comprou um barcelete!");
    }

    public void luvas(int vidaPersonagem, int vidaluva){
        vidaPersonagem += vidaluva;
        System.out.println("Você comprou uma luva!");
    }

    public void calcas(int vidaPersonagem, int vidacalça){
        vidaPersonagem += vidacalça;
        System.out.println("Você comprou uma calça!");
    }

    public void botas(int vidaPersonagem, int vidabota){
        vidaPersonagem += vidabota;
        System.out.println("Você comprou uma bota!");
    }

}