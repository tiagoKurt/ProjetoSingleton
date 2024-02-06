package classes;

public class Jogador {
   private String nome;
   private String id;
   private Rating rating = null;
   
   public Jogador(String nome, String id, Rating ratingPoints){
       this.nome = nome;
       this.id = id;
       rating = ratingPoints;
       
   }
}
