package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	//接続用の情報をフィールドに定数として定義
		/** ドライバーのクラス名 */
		private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
		/** ・JDMC接続先情報 */
		private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/jdbc_db";
		/** ・ユーザー名 */
		private static final String USER = "postgres";
		/** ・パスワード */
		private static final String PASS = "makina";

		public static void main(String[] args) {
			
			Connection connection = null;
	        Statement statement = null;
	        ResultSet resultSet = null;

			try {
	            Class.forName(POSTGRES_DRIVER);
	            // 問④ 問①〜③の定数を使ってデータベースと接続しなさい。
	           connection = DriverManager.getConnection(
	        		   "jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "makina");
	            statement = connection.createStatement();

	            String SQL = "SELECT * FROM shohin_tb";
	            resultSet = statement.executeQuery(SQL);

	            while (resultSet.next()) {
	                String column1 = resultSet.getString("shohin_id");
	                String column2 = resultSet.getString("shohin_name");
	                int column3 = resultSet.getInt("tanka");

	                System.out.print(column1 + ",");
	                System.out.print(column2 + ",");
	                System.out.println(column3);
	            }

	            // forName()で例外発生
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();

	            // getConnection()、createStatement()、executeQuery()で例外発生
	        } catch (SQLException e) {
	            e.printStackTrace();

	        } finally {
	            try {
	                if (resultSet != null) {
	                    resultSet.close();
	                }
	                if (statement != null) {
	                    statement.close();
	                }
	                if (connection != null) {
	                    connection.close();
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();

	            }
	        }
	    }
	}