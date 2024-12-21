package Gestionclass;

public class Responsable extends Employes{
    private float prime;

    public Responsable(float prime) {
        this.prime = prime;
    }

    public Responsable(int id, String nom, String adresse, int nb_heures, float prime) {
        super(id, nom, adresse, nb_heures);
        this.prime = prime;
    }
    @Override
    public String toString(){
        return("id :"+this.getId()+" name: "+this.getNom()+
                " adresse : "+this.getAdresse()+" nomhbre d'heures : "
                +this.getNb_heures()+ " prime "+this.prime);
    }
}
