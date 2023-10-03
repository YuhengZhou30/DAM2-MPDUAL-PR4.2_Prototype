
public class Forn extends Electrodomestic {
	
	public int temperatura;
	public boolean autoneteja;
	
	public Forn() {
		
	}
	public Forn(Forn maquina) {
        super(maquina);
        if (maquina != null) {
            this.temperatura = maquina.temperatura;
            this.autoneteja = maquina.autoneteja;
        }
    }
	@Override
	public Electrodomestic clone() {
        return new Forn(this);
    }
	
}
