

package batalha.pokemon;


public class Pokemon {

    String nome;
    String tipo;
    float vida;
    int dano;
    int defesa;

    public Pokemon(String nome, String tipo, float vida, int dano, int defesa) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
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


}

