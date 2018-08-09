package org.techgene.mvc.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.techgene.mvc.dto.RegistrationDTO;
@Component
public class RegistrationDAO 
{
	public RegistrationDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public void save(RegistrationDTO regdto)
	{
		System.out.println("inside save");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(RegistrationDTO.class);
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session se=sf.openSession();
		
		Transaction tx=se.beginTransaction();
		se.save(regdto);
		tx.commit();
		
	}
	
	
	public String validUsername(String name)
	{
		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session se = sf.openSession();

		String hql = "select username from RegistrationDTO where username='" + name + "'";

		Query qr = se.createQuery(hql);

		String password = (String) qr.uniqueResult();

		return password;

	}
	
	
	public String updatePassword(String fpassword, String femail)

	{

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session se = sf.openSession();

		String hql = "update RegistrationDTO set password='" + fpassword + "'  where username='" + femail + "'";

		Query q = se.createQuery(hql);

		Transaction tx = se.beginTransaction();

		q.executeUpdate();

		tx.commit();

		System.out.println("Sucessfull updated new password");

		return fpassword;

	}
	
	public int deleteUser(String userid)
	{
		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session se = sf.openSession();

		String hql = "delete from RegistrationDTO where username='" + userid + "'"  ;

		Query q = se.createQuery(hql);

		Transaction tx = se.beginTransaction();

		int id=q.executeUpdate();

		tx.commit();
		return id;
	}

}
