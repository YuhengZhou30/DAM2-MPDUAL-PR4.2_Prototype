import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rentadora r1=new Rentadora();		
		r1.color="blau";
		r1.eficiencia="A";
		r1.marca="Siemens";
		r1.nom="Op4-5fe3";
		r1.preu=599;
		r1.soroll=50;
		r1.revolucions=99;
		
		Rentadora r2 = new Rentadora();
		r2.color="Blanc";
		r2.eficiencia="B";
		r2.marca="Samsung";
		r2.nom="SA-948";
		r2.preu=450;
		r2.soroll=40;
		r2.revolucions=70;
		
		Nevera n1= new Nevera();
		n1.color="Blanc";
		n1.eficiencia="C";
		n1.marca="Corbero";
		n1.nom="OP-G43";
		n1.preu=923;
		n1.soroll=33;
		
		Nevera n2= new Nevera();
		n2.color="Gris";
		n2.eficiencia="A+";
		n2.marca="Samsung";
		n2.nom="SN-4TG";
		n2.preu=1200;
		n2.soroll=50;
		
		Forn f1= new Forn();
		f1.color="Gris";
		f1.eficiencia="F";
		f1.marca="Corbero";
		f1.nom="PG3K45";
		f1.preu=300;
		f1.temperatura=230;
		f1.autoneteja=true;
		
		Forn f2= new Forn();
		f2.color="Blanc";
		f2.eficiencia="F++";
		f2.marca="Chatarra";
		f2.nom="Chata3";
		f2.preu=120;
		f2.temperatura=60;
		f2.autoneteja=false;
		
		List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();
        
        llista.add(r1);
        llista.add(f2);
        llista.add(f1);
        llista.add(r2);
        llista.add(n1);
        llista.add(n2);
        

        // Clonar la llista
        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }
		

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
        
	}
	static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els Electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els Electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els Electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els Electrodomestics NO són identics");
            }
        }
    }

}
