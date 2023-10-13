package whiteCatLucy.factory;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import whiteCatLucy.connection.ConnectionMaker;
import whiteCatLucy.connection.OracleCM;
import whiteCatLucy.script.ScriptDAO;

// 전체적인 DAO를 관리
public class DAOFactory {
	public ScriptDAO scriptDAO() {
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