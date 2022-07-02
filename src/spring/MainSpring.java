package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring
{

	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml","applicationContext2.xml"});
		
		
		
			Prova p1 = (Prova) context.getBean("p1");
			
			System.out.println("ID:"+p1.getID());
			System.out.println("testo:"+p1.getCognome());
			System.out.println("nome:"+p1.getNome());
		
			
			Object[] parametri = new Object[] {Prova.Tipo.BAR};
			Prova p2 = (Prova) context.getBean("prova1", parametri);
			System.out.println("ID:"+p2.getID());
			System.out.println("cognome:"+p2.getCognome());
			System.out.println("nome:"+p2.getNome());
			
			System.out.println("p1.equals(p2):" +p1.equals(p2));
			System.out.println("p1==p2:" + (p1 == p2));
			
			{
				Object[] param3 = new Object[] {Prova.Tipo.BAR};
				Prova p3 = (Prova) context.getBean("prova1", param3);
				System.out.println("ID:"+p3.getID());
				System.out.println("cognome:"+p3.getCognome());
				System.out.println("nome:"+p3.getNome());
				
			}
			
			
			
			Prova2 prova2 = (Prova2) context.getBean("prova2");
			
			System.out.println("ID:"+prova2.getProva().getID());
			System.out.println("Cognome:"+prova2.getProva().getCognome());
			
		
		
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("classpath*:**/applicationContext*.xml");
	}
}
