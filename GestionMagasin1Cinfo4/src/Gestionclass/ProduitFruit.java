package Gestionclass;

public class ProduitFruit extends Produit implements Critere {
    private int quantite;
    private String saison;

    public ProduitFruit() {
        super();
    }

    public ProduitFruit(int id, String libelle, int quantite, String saison) {
        super(id, libelle);
        this.quantite = quantite;
        this.saison = saison;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getSaison() {
        return saison;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    @Override
     public String toString(){
         return "\n"+super.toString()+
                 " type = fruit \n Quantite := "+
                 this.quantite+
                 "\n   saison  "+
                 this.saison;

    }
    @Override
    public boolean estFrais(String saison) {
        if(this.saison.equals(saison))
            return true;
        return false;
    }
}
