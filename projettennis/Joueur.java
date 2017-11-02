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
class Joueur extends Profile {
    private String main;
    private String sponsor;
    public static int classement=0;
    private String entraineur;
    private String  vetement;
    private int point;
    private String couleur;
    protected String genre;
    
    public Joueur(){
       main="inconnu";
       sponsor="inconnu";
       classement++;
       entraineur="inconnu";
       vetement="inconnu";
       point=0;
       couleur="inconnu";
       genre="inconnu";
        
    }
    
    public Joueur (String pMain, String pSponsor,String pEntraineur,String pVetement, int pPoint,String pCouleur, String pGenre){
        main=pMain;
        sponsor=pSponsor;
        classement++;
        entraineur=pEntraineur;
        vetement=pVetement;
        point=pPoint;
        couleur=pCouleur;
        genre=pGenre;
    }
    
    public String getMain(){
        return main;
    }
    public String getSponsor(){
        return sponsor;
    }
    public String getEntraineur(){
        return entraineur;
    }
    public static int getClassement(){
            return classement;
    }
    public String getVetement(){
        return vetement;
    }
    public String getGenre(){
        return genre;
    }
    
    
    public void setMain(String pMain){
        main=pMain;
    }
    public void setSponsor(String pSponsor){
        sponsor=pSponsor;
    }
    public void setEntraineur(String pEntraineur){
        entraineur=pEntraineur;
    }
     public void setGenre(String pGenre){ 
        genre=pGenre; 
        this.updateVetement();
    }
    
    public void setPoint(int pPoint)
    {
        point=pPoint;
    }
    
    public String setCouleur(String pCouleur){
        couleur=pCouleur;
        String str=this.surnom+"change de couleur de"+this.vetement+"la nouvelle couleur est"+this.couleur;
        System.out.println(str);
        return str;
     
    }
   
    public void updateVetement(){
        if(this.genre.equals("homme"))
            this.vetement="short";
        else if(this.genre.equals("femme"))
            this.vetement="jupe";
        else
            System.out.println("veuillez rentrer homme ou femme en genre");
    }
}
