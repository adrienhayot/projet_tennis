/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettennis;

/**
 *
 * @author ISEN
 */
public class ProjetTennis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joueur adrien= new Joueur();
        Joueur antoine = new Joueur();
        System.out.println("le classement d'antoine est " + Joueur.classement);
        antoine.setGenre("Femme");
        antoine.setCouleur("rouge");
        System.out.println(antoine.getVetement());
        adrien.setGenre("feme");
        System.out.println(adrien.getVetement());
        
    }
    
}
