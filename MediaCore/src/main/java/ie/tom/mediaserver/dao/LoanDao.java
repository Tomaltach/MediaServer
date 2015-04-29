package ie.tom.mediaserver.dao;

import ie.tom.mediaserver.entity.Loan;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LoanDao {
	void addLoan(Loan loan);
	void updateLoan(Loan loan);
	void saveLoan(Loan loan);
	void deleteLoan(Loan loan);
	Loan findById(int loan_id);
	List<Loan> findByMemberId(int member_id);
	List<Loan> findByMediaId(int media_id);
	List<Loan> findByLoanDate(int loan_date);
	List<Loan> findAll();
}