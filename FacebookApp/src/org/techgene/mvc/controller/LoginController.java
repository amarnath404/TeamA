package org.techgene.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techgene.mvc.dao.LoginDAO;
import org.techgene.mvc.dto.LoginDTO;

@Controller
@Component
@RequestMapping("/")
public class LoginController extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	LoginDAO logdao;
	
	
	public LoginController() 
	{
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	/*
	  @RequestMapping("/login")
	 
	
	public String authm(@ModelAttribute LoginDTO logdto) 
	{
		
		String fmnum=logdto.getUsername();
		String fpassword=logdto.getPassword();
		
		int id=logdao.getIdbyMnum(fmnum);
		System.out.println("USER ID IS ::::::"+id);
		
		if(id!=0)
		{
			
			String dbpassword=logdao.getpasswordbyMnum(fmnum);
			
			if(fpassword.equals(dbpassword))
			{
				return "./Sucess.jsp";
			}
		}
		
			return "/Unsucess.jsp";	
		
	}
	*/
	
	  @RequestMapping("/login")
	 
	
	public String auth(@ModelAttribute LoginDTO logdto,HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		
		String fusername=logdto.getUsername();
		String fpassword=logdto.getPassword();
		
		int id=logdao.getIdbyusername(fusername);
		
		if(id!=0)
		{
			String dbpassword=logdao.getpasswordbyUsername(fusername);
			
			if(fpassword.equals(dbpassword))
			{
				return "./Sucess.jsp";
			}
		}
		
		
		return "/Unsucess.jsp";
		
	}
	
	
	
}
