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

@Component
@Controller
@Repository

@RequestMapping("/")
public class DeleteUser
{
	@Autowired
	LoginDTO logdto;
	
	@Autowired
	LoginDAO logdao;
	
	@Autowired
	RegistrationDAO regdao;
	
	@RequestMapping("/delete")
	
	public String deleteUser(@ModelAttribute LoginDTO logdto)
	{
		String fusername=logdto.getUsername();
		
		String dfname=logdao.getUsernamebyemail(fusername);
		System.out.println(dfname);
		
		if(dfname!=null)
		{
			logdao.deleteUser(fusername);
			regdao.deleteUser(fusername);
			
			return "./Sucess.jsp";
			
		}
		
		return "./DeleteUser.jsp";
		
	}

}
