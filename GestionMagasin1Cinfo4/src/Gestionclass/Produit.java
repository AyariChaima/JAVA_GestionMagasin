
package Gestionclass;

import java.util.Date;

public class Produit {
    public int id;
    public String libelle;
    public String marque;
    public float prix;
    public Date date;

    public Produit() {

    }
    public Produit(int id, String lib) {
        this.id = id;
        this.libelle = lib;
    }
    public Produit(int id, String lib, String marque) {
        this.id = id;
        this.libelle = lib;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println(
                "LE Produir : id = "
                        + this.id + "\n"
                        + "libelle="
                        + this.libelle
                        + "\n" + "marque="
                        + this.marque + "\n"
                        + "prix = " + this.prix);
    }


    @Override
     public String toString() {
        return "LE Produit "
                + "id="
                + this.id
                + "libelle="
                + this.libelle
               ;
    }


}
