package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.AuthorityDao;
import ie.tom.mediaserver.entity.Authority;

@Repository
@Transactional
public class HibernateAuthorityDao implements AuthorityDao {
	private SessionFactory sessionFactory;
	
	public HibernateAuthorityDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addAuthority(Authority authority) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(authority);
	}
	@Override
	public void updateAuthority(Authority authority) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(authority);
	}
	@Override
	public void saveAuthority(Authority authority) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(authority);
	}
	@Override
	public void deleteAuthority(Authority authority) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(authority);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Authority> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Authority");
		return q.list();
	}
	@Override
	public Authority getByName(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Authority) session.get(Authority.class, username);
	}
}
