
public class Rentadora extends Electrodomestic{
	public int revolucions;
	public int soroll;
	
	
	public Rentadora () {
		
	}
	public Rentadora(Rentadora maquina) {
        super(maquina);
        if (maquina != null) {
            this.revolucions = maquina.revolucions;
            this.soroll = maquina.soroll;
        }
    }
	
	
	
	
	
	
	@Override
	public Electrodomestic clone() {
        return new Rentadora(this);
    }

}
