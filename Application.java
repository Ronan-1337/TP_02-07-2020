package TP_1;

public class Application {

	
	public static void dispConstruct(Salarie bob) {
		System.out.println("Vous vous appelez "+bob.getM_strNom());
		System.out.println("Votre numéro de matricule est : "+bob.getM_nMatricule());
		System.out.println("Votre numéro de categorie est : "+bob.getM_nCategorie());
		System.out.println("Votre numéro de service est : "+bob.getM_nService());
		System.out.println("Votre salaire est de "+bob.getM_dSalaire()+" € par mois.");
		System.out.println("Vous venez de creer le Salarie numero "+Salarie.salariecount);
	}
	
	public static void main(String[] args) {
		Salarie.salariecount = 0;
		System.out.println("construction du salarie Jean");
		Salarie jean = new Salarie(1, 2, 3, "Jean", 200);
		System.out.println("construction du salarie Jacques");
		Salarie jacques = new Salarie(4, 5, 6, "Jacques", 300);
		System.out.println("construction du Commercial Pierre");
		Commercial pierre = new Commercial(7, 8, 9, "Pierre", 400, 400, 20);
		System.out.println("construction du Commercial Paul");
		Commercial paul = new Commercial(10, 11, 12, "Paul", 800, 200, 10);
		System.out.println("tostring de Jean : "+jean.toString());
		System.out.println("tostring de Pierre : "+pierre.toString());
		System.out.println("Jean equals Jean ? -> "+jean.equals(jean));
		System.out.println("Jean equals Jacques ? -> "+jean.equals(jacques));
		System.out.println("Jean equals Paul ? -> "+jean.equals(paul));
		System.out.println("Pierre equals Pierre ? -> "+pierre.equals(pierre));
		System.out.println("Pierre equals Paul ? -> "+pierre.equals(paul));
		System.out.println("Pierre equals Jacques ? -> "+pierre.equals(jacques));
		System.out.println("calculSalaire de Jean : ");
		jean.calculSalaire();
		System.out.println("calculSalaire de Pierre : ");
		pierre.calculSalaire();
	}

}
