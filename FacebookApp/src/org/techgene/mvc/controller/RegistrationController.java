package org.techgene.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techgene.mvc.dao.LoginDAO;
import org.techgene.mvc.dao.RegistrationDAO;
import org.techgene.mvc.dto.LoginDTO;
import org.techgene.mvc.dto.RegistrationDTO;
import org.techgene.mvc.mail.SendMail;
import org.techgene.mvc.util.AccNumGen;

@Controller
@Component
@Repository
@RequestMapping("/")

	public class RegistrationController {
	
	@Autowired
	RegistrationDTO regdto;
	@Autowired
	RegistrationDAO regdao;
	@Autowired
	LoginDAO logdao;
	@Autowired
	LoginDTO logdto;
	
	@Autowired
	AccNumGen accnum;
	
	@Autowired
	SendMail mail;
	
	
	@RequestMapping("/register")
	
	public String saveData(@ModelAttribute RegistrationDTO regdto)
	{
			
			String username=regdto.getUsername();
			String password=regdto.getPassword();
			String mobilenumber=regdto.getMobilenumber();
			
			String rdusername=regdao.validUsername(username);
			String ldusername=logdao.validUsername(username);
			
			long accnumber=accnum.getNum();
			
			regdto.setAccnum(accnumber);
			
			if(rdusername==null&ldusername==null)
			{
				logdto.setId(regdto.getId());
				logdto.setUsername(username);
				logdto.setPassword(password);
				logdto.setMobilenumber(mobilenumber);
				
				
				regdao.save(regdto);
				logdao.save(logdto);
				
				System.out.println("Data sucessfully stored");
				mail.sendMailTo(username);
				
				return "/Login.jsp";
			}
			
			else
			{
				System.out.println("Invalid username");
				System.out.println("Username already exists");
				return"/Registration.jsp";
				
			}
			
			
		
	}
	
}
