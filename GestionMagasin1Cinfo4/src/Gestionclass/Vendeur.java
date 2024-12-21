package Gestionclass;

public class Vendeur extends Employes {
    public float tauxDeVente;

    public Vendeur(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur(int id, String nom, String adresse, int nb_heures, float tauxDeVente) {
        super(id, nom, adresse, nb_heures);
        this.tauxDeVente = tauxDeVente;
    }
    @Override
    public String toString(){
        return("id :"+this.getId()+" name: "+this.getNom()+
                " adresse : "+this.getAdresse()+" nomhbre d'heures : "
                +this.getNb_heures()+ " taux De Vente "+this.tauxDeVente);
    }
}


