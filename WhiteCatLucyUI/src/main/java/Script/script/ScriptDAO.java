package Script.script;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ScriptDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ScriptDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void drop() {
		jdbcTemplate.execute("drop table script");
	}
	
	public void upgradeDrop() {
		jdbcTemplate.execute(
				"BEGIN\r\n"
			 	+"EXECUTE IMMEDIATE 'DROP TABLE script';\r\n"
			 	+"EXCEPTION\r\n"
			 	+"WHEN OTHERS THEN\r\n"
			 	+"IF SQLCODE != -942 THEN\r\n"
			 	+"RAISE;\r\n"
			 	+"END IF;\r\n"
			 	+"END;");
	}
	
	public void create() throws Exception{

		jdbcTemplate.execute("create table script (\r\n"
				+" id number generated as identity primary key, \r\n"
				+" name varchar2(20), \r\n"
				+" script varchar2(300) not null unique \r\n"
				+" )");

	}
	
	public void add(ScriptInterface user) {
		
		jdbcTemplate.update(								 
		"insert into script ( name, script ) values ( ?, ?)",
		user.getName(),
		user.getScript());

	}

	public void delete(ScriptInterface user) {
		jdbcTemplate.update(
		"delete from script where id=?",
		user.getId());
	}

	public ScriptInterface get(int id) {

		return jdbcTemplate.queryForObject(
			"select * from script where user_id=?", 
			new Object[] {id},
			new RowMapper<ScriptBean>() {

			@Override 
			public ScriptBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				ScriptBean user= new ScriptBean();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setScript(rs.getString("script"));

				return user;
			}
		});
	}
}