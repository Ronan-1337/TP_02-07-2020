package TP_1;

public class Salarie {
	private int	m_nMatricule, m_nCategorie, m_nService;
	private String m_strNom;
	private double m_dSalaire;
	public static int salariecount = 0;
	
	public Salarie(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) throws SalaireSalarieException, CategorieSalarieException{
		if(m_dSalaire < 0)
			throw new SalaireSalarieException("Le salaire doit être positif");
		if(m_nCategorie != 1 && m_nCategorie != 2 && m_nCategorie != 3)
			throw new CategorieSalarieException("la catégorie de salarié ne peut être que 1 (cadre),  2 (technicien),  ou 3 (employé)");
		this.m_nMatricule = m_nMatricule;
		this.m_nCategorie = m_nCategorie;
		this.m_nService = m_nService;
		this.m_strNom = m_strNom;
		this.m_dSalaire = m_dSalaire;
		System.out.println("Construction de l'objet Salarie au nom "+m_strNom);
		salariecount++;
	}
	public int getM_nMatricule() {
		return m_nMatricule;
	}
	public void setM_nMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}
	public int getM_nCategorie() {
		return m_nCategorie;
	}
	public void setM_nCategorie(int m_nCategorie) throws CategorieSalarieException{
		if(m_nCategorie != 1 && m_nCategorie != 2 && m_nCategorie != 3)
			throw new CategorieSalarieException("la catégorie de salarié ne peut être que 1 (cadre),  2 (technicien),  ou 3 (employé)");
		this.m_nCategorie = m_nCategorie;
	}
	public int getM_nService() {
		return m_nService;
	}
	public void setM_nService(int m_nService) {
		this.m_nService = m_nService;
	}
	public String getM_strNom() {
		return m_strNom;
	}
	public void setM_strNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}
	public double getM_dSalaire() {
		return m_dSalaire;
	}
	public void setM_dSalaire(double m_dSalaire) throws SalaireSalarieException{
		if(m_dSalaire < 0)
			throw new SalaireSalarieException("Le salaire doit être positif");
		this.m_dSalaire = m_dSalaire;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(m_dSalaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + m_nCategorie;
		result = prime * result + m_nMatricule;
		result = prime * result + m_nService;
		result = prime * result + ((m_strNom == null) ? 0 : m_strNom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salarie other = (Salarie) obj;
		if (Double.doubleToLongBits(m_dSalaire) != Double.doubleToLongBits(other.m_dSalaire))
			return false;
		if (m_nCategorie != other.m_nCategorie)
			return false;
		if (m_nMatricule != other.m_nMatricule)
			return false;
		if (m_nService != other.m_nService)
			return false;
		if (m_strNom == null) {
			if (other.m_strNom != null)
				return false;
		} else if (!m_strNom.equals(other.m_strNom))
			return false;
		return true;
	}

	public String toString() {
		return "Salarie [m_nMatricule=" + m_nMatricule + ", m_nCategorie=" + m_nCategorie + ", m_nService=" + m_nService
				+ ", m_strNom=" + m_strNom + ", m_dSalaire=" + m_dSalaire + "]";
	}
	
	public void calculSalaire() {
		System.out.println("Le salaire de "+this.m_strNom+" le salarié est de "+this.m_dSalaire);
	}
	
}
