package com.smartkode.toretto.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smartkode.toretto.entidad.Alumno;

@Repository
public class AlumnoDAOImp implements AlumnoDAO {
	
private static final Logger logger = LoggerFactory.getLogger(AlumnoDAOImp.class);

	
	private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
	        this.sessionFactory = sf;
	    }
	 @Override
	 @Transactional
	public void addAlumno(Alumno a) {
		//getCurrentSession().save(a);
		 Session session = this.sessionFactory.getCurrentSession();
	        session.saveOrUpdate(a);
	        logger.info("Phone saved successfully, Phone Details=" + a);
	}

	
}
