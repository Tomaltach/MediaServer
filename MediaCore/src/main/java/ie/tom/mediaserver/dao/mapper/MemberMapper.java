package ie.tom.mediaserver.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.tom.mediaserver.entity.Member;

import org.springframework.jdbc.core.RowMapper;

public class MemberMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int i) throws SQLException {
		Member m = new Member();
		m.setMember_id(rs.getInt("member_id"));
		m.setUsername(rs.getString("username"));
		m.setFirst_name(rs.getString("first_name"));
		m.setLast_name(rs.getString("last_name"));
		m.setEmail(rs.getString("email"));
		m.setMedia_allowance(rs.getInt("media_allowance"));
		
		return m;
	}
}
