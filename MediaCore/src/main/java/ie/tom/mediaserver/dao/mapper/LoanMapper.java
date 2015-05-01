package ie.tom.mediaserver.dao.mapper;

import ie.tom.mediaserver.entity.Loan;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoanMapper implements RowMapper<Loan> {

	@Override
	public Loan mapRow(ResultSet rs, int i) throws SQLException {
		Loan l = new Loan();
		l.setLoan_id(rs.getInt("loan_id"));
		l.setMember_id(rs.getInt("member_id"));
		l.setMedia_id(rs.getInt("media_id"));
		l.setLoan_date(rs.getDate("loan_date"));
		
		return l;
	}
}
