package org.techgene.mvc.controller;

import org.techgene.mvc.dao.LoginDAO;

public class TesterEmail 
{
	
	public static void main(String[] args)
	{
		
		LoginDAO dao=new LoginDAO();
		
		String mnum="9000411308";
		dao.getIdbyMnum(mnum);
		
		
	}
}
