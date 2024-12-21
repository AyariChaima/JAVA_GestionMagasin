package Gestionclass;

public class ProduitLegume extends Produit{
    private int quantite ;
    private String saison ;

    public ProduitLegume() {
        super();
    }
    public ProduitLegume(int id, String libelle, int quantite, String saison) {
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
                " type = legume \n Quantite := "+
                this.quantite+
                "\n   saison  "+
                this.saison;

    }
}
