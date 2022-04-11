
package batalha.pokemon;

public class Batalha extends javax.swing.JFrame {
    
    Pokemon pokemon1 = new Pokemon("Pikachu", "Raio", 144, 40, 30);
    Pokemon pokemon2 = new Pokemon("Squirtle", "Água", 130, 23, 15);
    
    
    public String  Batalhar (){
        String resp = "";
        if(this.pokemon1.dano > this.pokemon2.dano){
            resp = "Pikachu Ganhou!!!";
        }
    return resp;
    }
           
}
