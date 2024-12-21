/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin1cinfo4;

import Gestionclass.*;

/**
 * @author Mohamed
 */
public class GestionMagasin1Cinfo4 {

    public static void main(String[] args) {
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "yaourt", "vitalait");
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.200f);
        ProduitFruit p5 =new ProduitFruit(1254, "fraise", 12 ,"mars");
        Produit p6=new ProduitFruit(1224, "pasteque", 50 , "juin");
        Produit p7=new ProduitFruit(7896, "Mandarine", 25 , "Decembre");
        Produit p8=new ProduitLegume(8521 , "artichauts",14 ,"janvier");



        Magasin m1 = new Magasin(1, "carrefour", "Centre-ville", 10);
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6", 10);
        m1.ajouter(p5);
        m1.ajouter(p6);
        m1.ajouter(p7);
        m1.ajouter(p8);
        m1.ajouter(p2);
        //System.out.println(m1.toString());
        System.out.println(ProduitFruit.class);
        System.out.println(p5.getClass());
//
//        //empolyer carffour
//        Caissier c1=new Caissier(1,"mohamed","ariana",40,0);
//        Caissier c2=new Caissier(2,"ziyed","benarous",15,1);
//
//        Vendeur v1=new Vendeur (3,"salah","ezzahra",7,1.5f);
//
//        Responsable r1=new Responsable(4,"Lotfi","beb khadhra",120,210f);
//
//        //empolyer Monoprix
//        Caissier c3=new Caissier(1,"dali","ariana",40,0);
//        Vendeur v2=new Vendeur (3,"ali","ezzahra",7,1.5f);
//        Vendeur v3=new Vendeur (3,"mehrez","ezzahra",7,1.5f);
//        Vendeur v4=new Vendeur (3,"riyadh","ezzahra",20,1.5f);
//        Responsable r2=new Responsable(4,"haythem","beb laasal",120,210f);
//        //ajouter les employes carffour
//        m1.ajouterE(c1);
//        m1.ajouterE(c2);
//        m1.ajouterE(v1);
//        m1.ajouterE(r1);
//        //ajouter les employes monoprix
//        m2.ajouterE(c3);
//        m2.ajouterE(v2);
//        m2.ajouterE(v3);
//        m2.ajouterE(v4);
//        m2.ajouterE(r2);
//
//        m1.afficherM();
//        m2.afficherM();
//

//           p1.afficher();
//           p2.afficher();
//           p3.afficher();
//           p4.afficher();
//        System.out.println("***********************");
//        p2.prix = 0.7f;
//
        p2.afficher();
        System.out.println("***************");

//        p1.id = 10;
//        p1.libelle = "Lait";
//        p1.marque = "natilait";
//        p1.prix = 1.1f;
//
//        p3.prix = 0.450f;
//        p1.afficher();
//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
//
//
//p1.date =new Date(2012,12,12);
//p2.date = new Date(1254514410);
//System.out.println(p1.toString());
    }

}
