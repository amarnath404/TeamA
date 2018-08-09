package org.techgene.mvc.controller;

import org.techgene.mvc.dao.LoginDAO;

public class Tester 
{
public static void main(String[] args) {
	
	LoginDAO ldao=new LoginDAO();
	
	System.out.println("tester");
	
	
	
		int id1=ldao.getIdbyusername("rajaaero@gmail.com");
		/*int id2=ldao.getIdbypassword("vbrvbr5233");
		
		if(id1==id2)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Invalid user");
		}*/
		
	
	
	




	/*while(lit.hasNext())
	{
		 String str=(String)lit.next();
		 System.out.println(str);
		 
	}

/*	while(lit.hasNext())
	{
		while(it.hasNext())
		{
			b=(fusername.equals(lit.next()));
			b=(fpassword.equals(it.next()));
			
			if(b==true)
			{
				System.out.println("BOTH USER AND PASSWORD ARE CORRECT");
			}
		}
		
	}*/
	
}
}
