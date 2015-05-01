package ie.tom.mediaserver.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ie.tom.mediaserver.entity.Authority;

import org.springframework.jdbc.core.RowMapper;

public class AuthorityMapper implements RowMapper<Authority> {

	@Override
	public Authority mapRow(ResultSet rs, int i) throws SQLException {
		Authority a = new Authority();
		a.setUsername(rs.getString("username"));
		a.setPermission(rs.getString("permission"));
		
		return a;
	}
}
