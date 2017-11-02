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
public class Profile {
    
    protected String nomNaissance;
    protected String nomCourant;
    protected String prenom;
    protected String surnom;
    protected String dateNaissance;
    protected String lieuNaissance;
    protected String dateDeces;
    protected String nationalite;
    protected int    taille;
    protected int    poids;
    
    public Profile(){
        nomNaissance="inconnu";
        nomCourant="inconnu";
        prenom="inconnu";
        surnom="inconnu";
        dateNaissance="inconnu";
        lieuNaissance="inconnu";
        dateDeces="inconnu";
        nationalite="inconnu";
        taille=0;
        poids=0;
        
    }
    public Profile(String pNomNaissance, String pNomCourant,String pPrenom, String pSurnom, String pDateNaissance, String pLieuNaissance, String pDateDeces, String pNationalite, int pTaille, int pPoids){
        nomNaissance= pNomNaissance;
        nomCourant=pNomCourant;
        prenom=pPrenom;
        surnom=pSurnom;
        dateNaissance=pDateNaissance;
        lieuNaissance=pLieuNaissance;
        dateDeces=pDateDeces;
        nationalite=pNationalite;
        taille=pTaille;
        poids=pPoids;
        
    }
    
    public String getNomNaissance (){
        return nomNaissance;
    }  
    public String getNomCourant(){
        return nomCourant;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getSurnom(){
        return surnom;
    }
    public String getDateNaissance(){
        return dateNaissance;
    }
    public String getLieuNaissance(){
        return lieuNaissance;
    }
    public String getDateDeces(){
        return dateDeces;
    }
    public String getNationalite(){
        return nationalite;
    }
 
     
    public int    getTaille(){
        return taille;
    }
    public int    getPoids(){
        return poids;
    }
    
    public void setNomCourant(String pNomCourant){
        nomCourant=pNomCourant;
    }
    public void setNomNaissance(String pNomNaissance){
         nomNaissance=pNomNaissance;
     }   
    public void setPrenom(String pPrenom){
        prenom=pPrenom;
    }    
    public void setSurnom(String pSurnom){
        surnom=pSurnom;
    }
    public void setDateNaissance(String pDateNaissance){
        dateNaissance=pDateNaissance;
    }
    public void setLieuNaissance(String pLieuNaissance){
        lieuNaissance=pLieuNaissance;
    }
    public void setDateDeces(String pDateDeces){
        dateDeces=pDateDeces;
    }
    public void setNationalite(String pNationalite){
        nationalite=pNationalite;
    }
   
    public void setTaille(int pTaille){
        taille=pTaille;
    }
    public void setPoids(int pPoids){
        poids=pPoids;
    }        
            
    }
            
    
    

