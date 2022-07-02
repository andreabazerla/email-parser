package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AltriDatiAnagraficaUnica")
public class User
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int IDAnagUnica;
	
	@Column
	private String sesso;
	
	@Column
	private String IDComuneNasc;
	
	@Column
	private String statoCivile;
	
	@Column
	private String codFiscConiuge;
	
	@Column
	private String cognomeConiuge;
	
	@Column
	private String nomeConiuge;
	
	@Column
	private String IDComuneResi;
	
	@Column
	private String CAPResi;
	
	@Column
	private String telefono;
	
	@Column
	private String cellulare;
	
	@Column
	private String eMail;
	
	@Column
	private String note;
	
	@Column
	private String doUltimaModifica;
	
	@Column
	private String uteUltimaModifica;
	
	@Column
	private String servizioUltimaMod;
	
	@Column
	private String tipoDocumento;
	
	@Column
	private String numeroDocumento;
	
	@Column
	private String dataScadenza;
	
	@Column
	private String dataDocumento;
	
	@Column
	private String autorita;
	
	@Column
	private String resiindirizzo;
	
	@Column
	private String resitipologia;
	
	@Column
	private String resinumeroCivico;
	
	@Column
	private String resifrazione;
	
	@Column
	private String loginz;
	
	@Column
	private String passwordz;
	
	@Column
	private String emailProfilo;
	
	@Column
	private String primoAccesso;
	
	@Column
	private String consensoPortale;
	
	@Column
	private String motivoRifiutoPortale;
	
	@Column
	private String IDAnagraficaPortale;
	
	@Column
	private String dataUltModPromPortale;
	
	@Column
	private String dataUltModPortale;
	
	@Column
	private String codiceIban;
	
	@Column
	private String doUltimaSincPortale;
	
	@Column
	private String IDUltimaSedeServizioPrestato;
	
	@Column
	private String spoolDoc730Generato;
	
	@Column
	private String servizioPrimaMod;
	
	@Column
	private String dataCreazione;

	public User(int iDAnagUnica,
	            String sesso,
	            String iDComuneNasc,
	            String statoCivile,
	            String codFiscConiuge,
	            String cognomeConiuge,
	            String nomeConiuge,
	            String iDComuneResi,
	            String cAPResi,
	            String telefono,
	            String cellulare,
	            String eMail,
	            String note,
	            String doUltimaModifica,
	            String uteUltimaModifica,
	            String servizioUltimaMod,
	            String tipoDocumento,
	            String numeroDocumento,
	            String dataScadenza,
	            String dataDocumento,
	            String autorita,
	            String resiindirizzo,
	            String resitipologia,
	            String resinumeroCivico,
	            String resifrazione,
	            String loginz,
	            String passwordz,
	            String emailProfilo,
	            String primoAccesso,
	            String consensoPortale,
	            String motivoRifiutoPortale,
	            String iDAnagraficaPortale,
	            String dataUltModPromPortale,
	            String dataUltModPortale,
	            String codiceIban,
	            String doUltimaSincPortale,
	            String iDUltimaSedeServizioPrestato,
	            String spoolDoc730Generato,
	            String servizioPrimaMod,
	            String dataCreazione)
	{
		super();
		this.IDAnagUnica = iDAnagUnica;
		this.sesso = sesso;
		this.IDComuneNasc = iDComuneNasc;
		this.statoCivile = statoCivile;
		this.codFiscConiuge = codFiscConiuge;
		this.cognomeConiuge = cognomeConiuge;
		this.nomeConiuge = nomeConiuge;
		this.IDComuneResi = iDComuneResi;
		this.CAPResi = cAPResi;
		this.telefono = telefono;
		this.cellulare = cellulare;
		this.eMail = eMail;
		this.note = note;
		this.doUltimaModifica = doUltimaModifica;
		this.uteUltimaModifica = uteUltimaModifica;
		this.servizioUltimaMod = servizioUltimaMod;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.dataScadenza = dataScadenza;
		this.dataDocumento = dataDocumento;
		this.autorita = autorita;
		this.resiindirizzo = resiindirizzo;
		this.resitipologia = resitipologia;
		this.resinumeroCivico = resinumeroCivico;
		this.resifrazione = resifrazione;
		this.loginz = loginz;
		this.passwordz = passwordz;
		this.emailProfilo = emailProfilo;
		this.primoAccesso = primoAccesso;
		this.consensoPortale = consensoPortale;
		this.motivoRifiutoPortale = motivoRifiutoPortale;
		this.IDAnagraficaPortale = iDAnagraficaPortale;
		this.dataUltModPromPortale = dataUltModPromPortale;
		this.dataUltModPortale = dataUltModPortale;
		this.codiceIban = codiceIban;
		this.doUltimaSincPortale = doUltimaSincPortale;
		this.IDUltimaSedeServizioPrestato = iDUltimaSedeServizioPrestato;
		this.spoolDoc730Generato = spoolDoc730Generato;
		this.servizioPrimaMod = servizioPrimaMod;
		this.dataCreazione = dataCreazione;
	}
	
	public User()
	{
		super();
	}

	public int getIDAnagUnica()
	{
		return IDAnagUnica;
	}

	public String getSesso()
	{
		return sesso;
	}

	public String getIDComuneNasc()
	{
		return IDComuneNasc;
	}

	public String getStatoCivile()
	{
		return statoCivile;
	}

	public String getCodFiscConiuge()
	{
		return codFiscConiuge;
	}

	public String getCognomeConiuge()
	{
		return cognomeConiuge;
	}

	public String getNomeConiuge()
	{
		return nomeConiuge;
	}

	public String getIDComuneResi()
	{
		return IDComuneResi;
	}

	public String getCAPResi()
	{
		return CAPResi;
	}

	public String getTelefono()
	{
		return telefono;
	}

	public String getCellulare()
	{
		return cellulare;
	}

	public String geteMail()
	{
		return eMail;
	}

	public String getNote()
	{
		return note;
	}

	public String getDoUltimaModifica()
	{
		return doUltimaModifica;
	}

	public String getUteUltimaModifica()
	{
		return uteUltimaModifica;
	}

	public String getServizioUltimaMod()
	{
		return servizioUltimaMod;
	}

	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	public String getDataScadenza()
	{
		return dataScadenza;
	}

	public String getDataDocumento()
	{
		return dataDocumento;
	}

	public String getAutorita()
	{
		return autorita;
	}

	public String getResiindirizzo()
	{
		return resiindirizzo;
	}

	public String getResitipologia()
	{
		return resitipologia;
	}

	public String getResinumeroCivico()
	{
		return resinumeroCivico;
	}

	public String getResifrazione()
	{
		return resifrazione;
	}

	public String getLoginz()
	{
		return loginz;
	}

	public String getPasswordz()
	{
		return passwordz;
	}

	public String getEmailProfilo()
	{
		return emailProfilo;
	}

	public String getPrimoAccesso()
	{
		return primoAccesso;
	}

	public String getConsensoPortale()
	{
		return consensoPortale;
	}

	public String getMotivoRifiutoPortale()
	{
		return motivoRifiutoPortale;
	}

	public String getIDAnagraficaPortale()
	{
		return IDAnagraficaPortale;
	}

	public String getDataUltModPromPortale()
	{
		return dataUltModPromPortale;
	}

	public String getDataUltModPortale()
	{
		return dataUltModPortale;
	}

	public String getCodiceIban()
	{
		return codiceIban;
	}

	public String getDoUltimaSincPortale()
	{
		return doUltimaSincPortale;
	}

	public String getIDUltimaSedeServizioPrestato()
	{
		return IDUltimaSedeServizioPrestato;
	}

	public String getSpoolDoc730Generato()
	{
		return spoolDoc730Generato;
	}

	public String getServizioPrimaMod()
	{
		return servizioPrimaMod;
	}

	public String getDataCreazione()
	{
		return dataCreazione;
	}

	@Override
	public String toString()
	{

		return String.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s",
		                     IDAnagUnica,
		                     sesso,
		                     IDComuneNasc,
		                     statoCivile,
		                     codFiscConiuge,
		                     cognomeConiuge,
		                     nomeConiuge,
		                     IDComuneResi,
		                     CAPResi,
		                     telefono,
		                     cellulare,
		                     eMail,
		                     note,
		                     doUltimaModifica,
		                     uteUltimaModifica,
		                     servizioUltimaMod,
		                     tipoDocumento,
		                     numeroDocumento,
		                     dataScadenza,
		                     dataDocumento,
		                     autorita,
		                     resiindirizzo,
		                     resitipologia,
		                     resinumeroCivico,
		                     resifrazione,
		                     loginz,
		                     passwordz,
		                     emailProfilo,
		                     primoAccesso,
		                     consensoPortale,
		                     motivoRifiutoPortale,
		                     IDAnagraficaPortale,
		                     dataUltModPromPortale,
		                     dataUltModPortale,
		                     codiceIban,
		                     doUltimaSincPortale,
		                     IDUltimaSedeServizioPrestato,
		                     spoolDoc730Generato,
		                     servizioPrimaMod,
		                     dataCreazione);

	}

}
