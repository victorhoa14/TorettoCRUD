package com.smartkode.toretto.DAO;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smartkode.toretto.entidad.Pelicula;

@Repository
public class PeliculaDAOImp implements PeliculaDAO {
	
private static final Logger logger = LoggerFactory.getLogger(PeliculaDAOImp.class);

	
	private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
	        this.sessionFactory = sf;
	    }
	 @Override
	 @Transactional
	public void addPelicula(Pelicula a) {
		//getCurrentSession().save(a);
		 Session session = this.sessionFactory.getCurrentSession();
	        session.saveOrUpdate(a);
	        logger.info("Pelicula saved successfully");
	}
	 @Override
	 @Transactional
	public void updatePelicula(Pelicula a) {
		//getCurrentSession().save(a);
		 Session session = this.sessionFactory.getCurrentSession();
	        session.update(a);
	        logger.info("Pelicula actualizado");
	}

	 @Override
	 @Transactional
	 public Pelicula getPeliculaById(long id) {
		 Session session = this.sessionFactory.getCurrentSession();        
		 Pelicula p = (Pelicula) session.load(Pelicula.class, new Long(id));        
		 logger.info("Pelicula buscada"+p.getNombre());        
		 return p;
		 
	 }
	 @Override
	 @Transactional
	 public void eliminarPelicula(Pelicula p)
	 {
		 Session session = this.sessionFactory.getCurrentSession();
	        session.delete(p);
	        logger.info("Pelicula eliminada");
	 }
	 
	 @SuppressWarnings("unchecked")
	@Override
	 public List<Pelicula> listPelicula(){
		 Session session = this.sessionFactory.getCurrentSession();        
		 List<Pelicula> PeliculaList=session.createQuery("from Pelicula").list();       
		 for (Pelicula p : PeliculaList) 
		 	{            
			 logger.info("Pelicula List::" + p.getNombre()+p.getNo_pelicula());        
			 }       
		 return PeliculaList;
	 }
	
}
