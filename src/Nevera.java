
public class Nevera extends Electrodomestic{
	
	public int frigories;
	public int soroll;
	
	public Nevera () {
		
	}
	public Nevera(Nevera maquina) {
        super(maquina);
        if (maquina != null) {
            this.frigories = maquina.frigories;
            this.soroll = maquina.soroll;
        }
    }
	
	
	
	@Override
	public Electrodomestic clone() {
        return new Nevera(this);
    }

}
