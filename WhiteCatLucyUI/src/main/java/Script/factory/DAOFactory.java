package Script.factory;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import Script.connection.ConnectionMaker;
import Script.connection.OracleCM;
import Script.script.ScriptDAO;

// 전체적인 DAO를 관리
public class DAOFactory {
	public ScriptDAO scriptDAO() {
		System.out.println("이것은 작동합니다1");
		return new ScriptDAO(dataSource());
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new OracleCM();
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