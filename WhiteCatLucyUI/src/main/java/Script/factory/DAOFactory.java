package Script.factory;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import Script.script.ScriptDAO;

// 전체적인 DAO를 관리
public class DAOFactory {
	
	@Bean
	public ScriptDAO scriptDAO() {
		return new ScriptDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(oracle.jdbc.OracleDriver.class);
		
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dataSource.setUsername("oooonx");
		dataSource.setPassword("qwer");
		
		return dataSource;
	}
	
}