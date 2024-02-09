package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Subject;

public class SubjectDaoImpl implements SubjectDao{

	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("Cl1");
		em = factory.createEntityManager();
		
	}
	
	@Override
	public void create(Subject subject) {
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(Subject subject) {
		em.getTransaction().begin();
		em.merge(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Integer id) {
		Subject sub = find(id);
		
		em.getTransaction().begin();
		em.remove(sub);
		em.getTransaction().commit();
		
	}

	@Override
	public Subject find(Integer id) {
		return em.find(Subject.class, id);
	}

	@Override
	public List<Subject> findAll() {
		
		Query query = em.createNamedQuery("Rol.findAll");
		List<Subject> lista = query.getResultList();
		return lista;
	}

}
