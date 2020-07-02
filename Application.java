package TP_1;

import java.util.Hashtable;

public class Application {
	static Hashtable<Integer, Salarie> p;
	
	public void dispConstruct(Salarie bob) {
		System.out.println("Vous vous appelez "+bob.getM_strNom());
		System.out.println("Votre numéro de matricule est : "+bob.getM_nMatricule());
		System.out.println("Votre numéro de categorie est : "+bob.getM_nCategorie());
		System.out.println("Votre numéro de service est : "+bob.getM_nService());
		System.out.println("Votre salaire est de "+bob.getM_dSalaire()+" € par mois.");
		System.out.println("Vous venez de creer le Salarie numero "+Salarie.salariecount);
	}
	
	private  static void setPersonnel(){
		p = new Hashtable<>();
		
		Salarie jean = new Salarie(0, 2, 3, "Jean", 200);
		Salarie jacques = new Salarie(1, 1, 6, "Jacques", 300);
		Salarie jules = new Salarie(2, 3, 15, "Jules", 200);
		Salarie jerome = new Salarie(3, 3, 18, "Jerome", 300);
		Salarie jeremy = new Salarie(4, 1, 21, "Jeremy", 200);
		p.put(jean.getM_nMatricule(), jean);
		p.put(jacques.getM_nMatricule(), jacques);
		p.put(jules.getM_nMatricule(), jules);
		p.put(jerome.getM_nMatricule(), jerome);
		p.put(jeremy.getM_nMatricule(), jeremy);
		
		Commercial pierre = new Commercial(5, 2, 9, "Pierre", 400, 400, 20);
		Commercial paul = new Commercial(6, 1, 12, "Paul", 800, 200, 10);
		Commercial pedro = new Commercial(6, 1, 12, "Pedro", 800, 200, 10);
		Commercial pascal = new Commercial(6, 3, 12, "Pascal", 800, 200, 10);
		Commercial patrick = new Commercial(6, 2, 12, "Patrick", 800, 200, 10);
		p.put(pierre.getM_nMatricule(), pierre);
		p.put(paul.getM_nMatricule(), paul);
		p.put(pedro.getM_nMatricule(), pedro);
		p.put(pascal.getM_nMatricule(), pascal);
		p.put(patrick.getM_nMatricule(), patrick);
	}
	
	public static void main(String[] args) {
		Salarie.salariecount = 0;
		setPersonnel();
		for (int i = 0 ; p.get(i) != null ; i++)
			System.out.println(p.get(i).toString());
		System.out.println("Jean equals Jean ? -> "+p.get(0).equals(p.get(0)));
		System.out.println("Jean equals Jacques ? -> "+p.get(0).equals(p.get(1)));
		System.out.println("Jean equals Paul ? -> "+p.get(0).equals(p.get(6)));
		System.out.println("Pierre equals Pierre ? -> "+p.get(5).equals(p.get(5)));
		System.out.println("Pierre equals Paul ? -> "+p.get(5).equals(p.get(6)));
		System.out.println("Pierre equals Jacques ? -> "+p.get(5).equals(p.get(1)));
		System.out.println("calculSalaire de Jean : ");
		p.get(0).calculSalaire();
		System.out.println("calculSalaire de Pierre : ");
		p.get(5).calculSalaire();
	}

}
