
public abstract class Electrodomestic {

    public String nom;
    public String color;
    public int preu;
    public String marca;
    public String eficiencia;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic maquina) {
        if (maquina != null) {
            this.nom = maquina.nom;
            this.color = maquina.color;
            this.preu = maquina.preu;
            this.marca = maquina.marca;
            this.eficiencia = maquina.eficiencia;
        }
    }

    public abstract Electrodomestic clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return cast2.nom.equals(nom)  && cast2.color.equals(color) && cast2.preu==preu
        		&& cast2.marca.equals(marca)&& cast2.eficiencia.equals(eficiencia);
    }
}
