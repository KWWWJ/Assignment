package whiteCatLucy.script;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import whiteCatLucy.connection.ConnectionMaker;

public class ScriptDAO {
	// db와 통신하여 user의 데이터를 관리한다.
	private ConnectionMaker maker;
	private DataSource dataSource;
	
	public ScriptDAO(ConnectionMaker maker) {
		this.maker = maker;
	}
	public ScriptDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void add(ScriptBean user) throws Exception{
		Connection conn = dataSource.getConnection();
		
		String query = "insert into script ( name, script) values ( ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getScript());
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}
	
	public ScriptInterface get(String id) throws Exception{

		Connection conn = dataSource.getConnection();
		
		String query = "select * from script where id=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		ScriptInterface user = null;
		
		if(rs.next()) {
			user = new ScriptBean();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setScript(rs.getString("user_id"));
		}
		
		pstmt.close();
		conn.close();
		return user;
	}
}
