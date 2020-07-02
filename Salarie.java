package TP_1;

public class Salarie {
	private int	m_nMatricule, m_nCategorie, m_nService;
	private String m_strNom;
	private double m_dSalaire;
	public static int salariecount = 0;
	
	public Salarie(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
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
	public void setM_nCategorie(int m_nCategorie) {
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
	public void setM_dSalaire(double m_dSalaire) {
		this.m_dSalaire = m_dSalaire;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salarie other = (Salarie) obj;
		if (m_nMatricule != other.m_nMatricule)
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
		System.out.println("Le salaire de "+this.m_strNom+" est de "+this.m_dSalaire);
	}
}
