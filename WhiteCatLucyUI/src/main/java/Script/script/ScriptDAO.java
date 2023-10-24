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
				+" \"id\" number generated as identity primary key,\r\n"
				+" \"order\" number(2) not null,\r\n"
				+" \"where\" varchar2(20),\r\n"
				+" \"script\" varchar2(300) not null,\r\n"
				+" \"img\" varchar2(60) not null, \r\n"
				+" )");

	}
	
	public void add(ScriptInterface script) {
		
		jdbcTemplate.update(								 
		"insert into script ( \"order\" ,\"where\", \"script\", \"img\" ) values ( ?, ?, ?, ?)",
		script.getOrder(),
		script.getWhere(),
		script.getScript(),
		script.getImg());

	}

	public void delete() {
		jdbcTemplate.update(
		"delete from script");
	}

	public ScriptInterface get(int id) {

		return jdbcTemplate.queryForObject(
			"select * from script where \"id\"=?", 
			new Object[] {id},
			new RowMapper<ScriptBean>() {

			@Override 
			public ScriptBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				ScriptBean script= new ScriptBean();
				script.setId(rs.getInt("\"id\""));
				script.setOrder(rs.getInt("\"order\""));
				script.setWhere(rs.getString("\"where\""));
				script.setScript(rs.getString("\"script\""));
				script.setImg(rs.getString("\"img\""));

				return script;
			}
		});
	}
}