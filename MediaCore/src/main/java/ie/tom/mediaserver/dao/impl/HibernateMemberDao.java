package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.MemberDao;
import ie.tom.mediaserver.entity.Member;

@Repository
@Transactional
public class HibernateMemberDao implements MemberDao {
	private SessionFactory sessionFactory;
	
	public HibernateMemberDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addMember(Member member) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(member);

	}
	@Override
	public void updateMember(Member member) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(member);

	}
	@Override
	public void saveMember(Member member) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(member);	
	}
	@Override
	public void deleteMember(Member member) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(member);	
	}
	@Override
	public Member findById(int member_id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Member) session.get(Member.class, member_id);
	}
	@Override
	public Member findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Member> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Member> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Member> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Member> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Member");
		return q.list();
	}
}
