/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestionclass;

/**
 * @author moham
 */
public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private int capa;
    private int indice = 0;
    private int indiceE = 0;
    //tableau de produits
    private Produit[] produits;
    private Employes[] employes;


    public Magasin() {
        this.produits = new Produit[50];
        this.employes = new Employes[20];
    }

    public Magasin(int id, String nom, String adresse, int capa) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capa = capa;
        this.produits = new Produit[50];
        this.employes = new Employes[20];
    }

    public void ajouter(Produit p) {
        if ((this.indice < this.capa) || (this.indice < 50)) {
            this.produits[this.indice] = p;
            this.indice++;
        } else {
            System.out.println("le tableau est plein");
        }
    }

    public void ajouterE(Employes e) {
        if (this.indice < 20) {
            this.employes[this.indiceE] = e;
            this.indiceE++;
        } else {
            System.out.println("le tableau est plein");
        }
    }


    public void afficherM() {
        System.out.println(
                "Magasin : id = "
                        + this.id + "\n"
                        + " nom= "
                        + this.nom
                        + "\n" + " adresse = "
                        + this.adresse + "\n"
                        + " capa  = " + this.capa);
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null)
                produits[i].afficher();
        }
        for (int i = 0; i < employes.length; i++) {
            if (employes[i] != null)
                System.out.println(employes[i]);
        }
    }

    public void determinerTypeProduit(Produit p){
        if (p instanceof ProduitFruit)
            System.out.println("fruit");
        if (p instanceof ProduitLegume)
            System.out.println("legume");
        if (p instanceof Produit)
            System.out.println("autre");
    }
    public float calculeStock(){
        float qteTotal = 0.0f;
        for (int i = 0; i < indice; i++) {
            if(produits[i].getClass()== ProduitFruit.class){
                qteTotal+=((ProduitFruit)produits[i]).getQuantite();
            }
        }
        return qteTotal;
    }
    public float calculeStock1(){
        float qteTotal = 0.0f;
        for (int i = 0; i < indice; i++) {
            if(produits[i] instanceof ProduitFruit){
                qteTotal+=((ProduitFruit)produits[i]).getQuantite();
            }
        }
        return qteTotal;
    }
    // public void calcul() {
//        double s = 0;
//        for (int i = 0; i < employes.length; i++) {
//            if (employes[i] != null) {
//                if (employes[i] instanceof Vendeur) {
//                    Vendeur d = (Vendeur) employes[i];
//                    float tauxDeVente = d.tauxDeVente;
//                    System.out.println(tauxDeVente);
//                }
//                if (this.employes[i].nb_heures >= 160) {
//                    s = (this.employes[i].nb_heures * 10) + (this.employes[i].nb_heures * 0.2);
//                    System.out.println(s);
//                } else {
//                    s = this.employes[i].nb_heures * 10;
//
//                    System.out.println(s);
//                }
//            }
//
//        }
    //  }

    @Override

    public String toString() {
        String str = "";
        for (int i = 0; i < produits.length; i++) {
            if (produits[i] != null)
                str = str + produits[i].toString();
        }
        return "le magasin : id  =" + this.id
                + "adresse = \n" + this.adresse
                + "les produits \n" + str + "\n ";
    }

}
