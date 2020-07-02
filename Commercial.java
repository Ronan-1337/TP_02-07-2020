package TP_1;

public class Commercial extends Salarie{
	private double	m_dChiffreAffaire;
	private int		m_pcCommission;
	
	public Commercial(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire) {
		super(m_nMatricule, m_nCategorie, m_nService, m_strNom, m_dSalaire);
		// TODO Auto-generated constructor stub
	}
	public Commercial(int m_nMatricule, int m_nCategorie, int m_nService, String m_strNom, double m_dSalaire,
			double m_dChiffreAffaire, int m_pcCommission) {
		super(m_nMatricule, m_nCategorie, m_nService, m_strNom, m_dSalaire);
		this.m_dChiffreAffaire = m_dChiffreAffaire;
		this.m_pcCommission = m_pcCommission;
	}
	public double getM_dChiffreAffaire() {
		return m_dChiffreAffaire;
	}
	public void setM_dChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}
	public int getM_pcCommission() {
		return m_pcCommission;
	}
	public void setM_pcCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}
	
	@Override
	public void calculSalaire() {
		System.out.println("Le salaire de "+this.getM_strNom()+" est de "+(this.getM_dSalaire()+((this.m_dChiffreAffaire/100)*this.m_pcCommission)));
	}
	
	@Override
	public String toString() {
		return "Commercial [m_dChiffreAffaire=" + m_dChiffreAffaire + ", m_pcCommission=" + m_pcCommission
				+ ", toString()=" + super.toString() + "]";
	}
}
