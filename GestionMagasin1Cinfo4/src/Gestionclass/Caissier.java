package Gestionclass;

public class Caissier extends Employes {
    public int numeroDeCaisse;

    public Caissier(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public Caissier(int id, String nom, String adresse, int nb_heures, int numeroDeCaisse) {
        super(id, nom, adresse, nb_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    @Override
    public String toString(){
        return("id :"+this.getId()+" name: "+this.getNom()+
                " adresse : "+this.getAdresse()+" nomhbre d'heures : "
                +this.getNb_heures()+ " numero de caisse "+this.numeroDeCaisse);
    }
}
