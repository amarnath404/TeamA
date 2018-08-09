package org.techgene.mvc.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.techgene.mvc.dto.LoginDTO;

@Component
@Controller
@Repository

public class LoginDAO {

	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName() + "  Created");
	}

	Configuration cfg = null;
	SessionFactory sf = null;
	Session se = null;
	Transaction tx = null;

	public void save(LoginDTO dto) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LoginDTO.class);

	SessionFactory	sf = cfg.buildSessionFactory();

		Session se = sf.openSession();

		tx = se.beginTransaction();
		se.save(dto);
		tx.commit();

		se.close();

	}

	public String validUsername(String name) {
		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select username from LoginDTO where username='" + name + "'";

		Query qr = se.createQuery(hql);

		String password = (String) qr.uniqueResult();

		return password;

	}

	public int getIdbyusername(String username) {
		// Needed

		 cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LoginDTO.class);

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select id from LoginDTO where username='" + username + "'";

		Query q = se.createQuery(hql);

		int id1 = 0;
		try {

			id1 = (int) q.uniqueResult();

		} catch (Exception e) {
			e.getMessage();
		}

		return id1;

	}

	public int getIdbyMnum(String mnum) {
	Configuration	 cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LoginDTO.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session se = sf.openSession();

		String hql = "select id from LoginDTO where mobilenumber='" + mnum + "'";

		Query q = se.createQuery(hql);

		int id = 0;
		try {

			id = (int) q.uniqueResult();
		} catch (Exception e) {

		}

		System.out.println(id);
		return id;

	}

	public String getpasswordbyUsername(String username) {
		// NEDDED

		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select password from LoginDTO where username='" + username + "'";

		Query qr = se.createQuery(hql);

		String password = (String) qr.uniqueResult();

		return password;

	}

	public String getpasswordbyMnum(String fmnum) {
		// NEDDED

		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select password from LoginDTO where mobilenumber='" + fmnum + "'";

		Query qr = se.createQuery(hql);

		String password = (String) qr.uniqueResult();

		return password;

	}

	public String getUsernamebyemail(String femail) {

		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select fname from RegistrationDTO where username='" + femail + "'";

		Query qr = se.createQuery(hql);

		String password = (String) qr.uniqueResult();

		return password;

	}

	public int checkEmail(String email) {

		cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "select id from LoginDTO where username='" + email + "'";

		Query qr = se.createQuery(hql);

		int i = qr.executeUpdate();

		return i;

	}

	public String updatePassword(String fpassword, String femail)

	{

		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "update LoginDTO set password='" + fpassword + "'  where username='" + femail + "'";

		Query q = se.createQuery(hql);

		 tx = se.beginTransaction();

		q.executeUpdate();

		tx.commit();

		System.out.println("Sucessfull updated new password");

		return fpassword;

	}

	public int deleteUser(String userid) {
		 cfg = new Configuration();

		cfg.configure();

		 sf = cfg.buildSessionFactory();

		 se = sf.openSession();

		String hql = "delete from LoginDTO where username='" + userid + "'";

		Query q = se.createQuery(hql);

		 tx = se.beginTransaction();

		int id = q.executeUpdate();

		tx.commit();
		return id;
	}

}
