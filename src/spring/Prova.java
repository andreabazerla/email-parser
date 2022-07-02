package spring;

public class Prova
{

	private int ID;
	private String cognome ="Rossi";
	private String nome ="Giovanni";
	
	
	
	public Prova()
	{
		// TODO Auto-generated constructor stub
	}
	public Prova(String cognome)
	{
		super();
		this.cognome = cognome;
	}
	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	
	@Override
	public int hashCode()
	{
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prova other = (Prova) obj;
		if (ID != other.ID)
			return false;
		if (cognome == null)
		{
			if (other.cognome != null)
				return false;
		}
		else
			if (!cognome.equals(other.cognome))
				return false;
		if (nome == null)
		{
			if (other.nome != null)
				return false;
		}
		else
			if (!nome.equals(other.nome))
				return false;
		return true;
	}
	
	
	
	
	public enum Tipo
	{
		BAZ,
		BAR
	};
	
	public static Object createInstance(Tipo tipo)
	{
		switch (tipo)
		{
			case BAZ:
				return new Prova("Bazerla");

			case BAR:
				return new Prova("Barba");
		
		}
		
		
		throw new RuntimeException("Tipo non identificato: "+tipo);

	}
	
	
	
}
