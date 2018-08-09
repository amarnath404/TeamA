package org.techgene.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techgene.mvc.dao.LoginDAO;
import org.techgene.mvc.dto.LoginDTO;

@Component
@Controller
@Repository
@RequestMapping("/")

public class EmailVerification 
{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	LoginDAO logdao;
	
	@RequestMapping("/verification")
	
	public String everifcation(@ModelAttribute LoginDTO ldto ,HttpServletResponse resp ,HttpServletRequest req) throws IOException, ServletException
	{
		
		HttpSession hs=req.getSession();
		
		String email=ldto.getUsername();
		
		hs.setAttribute("email", email);
		
		int id=logdao.getIdbyusername(email);
		
		
		
		if(id!=0)
		{
			
			return "./NewPassword.jsp";
			
		}
		
		else
		{
			
			return "./EmailVerification.jsp";
		}
		
		
		
		
	}

}

