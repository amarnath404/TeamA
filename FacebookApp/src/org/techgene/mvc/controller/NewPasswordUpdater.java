package org.techgene.mvc.controller;

import javax.servlet.http.HttpServlet;
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
import org.techgene.mvc.dao.RegistrationDAO;
import org.techgene.mvc.dto.LoginDTO;

@Component
@Controller
@Repository

@RequestMapping("/")

public class NewPasswordUpdater extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Autowired
	LoginDTO ldto;
	
	@Autowired
	EmailVerification emver;
	
	@Autowired
	LoginDAO ldao;
	
	@Autowired
	RegistrationDAO rdao;
	
	@RequestMapping("/nPassword")
	
	public String updatePassword(@ModelAttribute LoginDTO logdto,HttpServletResponse resp ,HttpServletRequest req) throws InterruptedException
	{
		HttpSession hs=req.getSession();
		
		String fpassword=logdto.getPassword();
		
		String femail=(String) hs.getAttribute("email");
		
		
		ldao.updatePassword( fpassword, femail);
		rdao.updatePassword(fpassword, femail);
		
		String dpassword=ldao.getpasswordbyUsername(femail);
		
		String dusername=ldao.getUsernamebyemail(femail);
		
		
		
		
		req.setAttribute("msg", dusername);
		
		if(fpassword.equals(dpassword))
		{
			return "./Psucess.jsp";
		}
		
		else
		{
			return "./Login.jsp";
		}
		
	}

}
