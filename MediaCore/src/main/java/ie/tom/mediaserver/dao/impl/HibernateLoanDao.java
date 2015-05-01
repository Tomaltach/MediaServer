package ie.tom.mediaserver.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.tom.mediaserver.dao.LoanDao;
import ie.tom.mediaserver.entity.Loan;

@Repository
@Transactional
public class HibernateLoanDao implements LoanDao {
	private SessionFactory sessionFactory;

	public HibernateLoanDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addLoan(Loan loan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(loan);
	}
	@Override
	public void updateLoan(Loan loan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(loan);
	}
	@Override
	public void saveLoan(Loan loan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(loan);
	}
	@Override
	public void deleteLoan(Loan loan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(loan);
	}
	@Override
	public Loan findById(int loan_id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (Loan) session.get(Loan.class, loan_id);
	}
	@Override
	public List<Loan> findByMemberId(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Loan> findByMediaId(int media_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Loan> findByLoanDate(int loan_date) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Loan");
		return q.list();
	}
}
