package proiectBD;

import java.sql.*;
import java.util.Properties;

public class Demo {
	@SuppressWarnings("deprecation")

public void inserare(String instructiune) {

		Connection connection = null;
		Statement insertStatement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online","root","Toamna2000");
			insertStatement = connection.createStatement();
			insertStatement.execute(instructiune);
		
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (insertStatement != null) {
				try {
					insertStatement.close();
				} catch (SQLException e) {
				}
				insertStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}
	}
public int adrese() {
		
		Connection connection = null;
		Statement selectStatement = null;
		ResultSet rs = null;
		Adresa a = new Adresa();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online","root","Toamna2000");
			selectStatement = connection.createStatement();
			selectStatement.execute("SELECT id_adresa_client FROM adresa_client");
			rs = selectStatement.getResultSet();
			
			while(rs.next()) {
			a.idAdresa.add(rs.getInt("id_adresa_client"));	
			}
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (selectStatement != null) {
				try {
					selectStatement.close();
				} catch (SQLException e) {
				}
				selectStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}
		return a.idAdresa.size();
		
	}
public Client statements3(Client c) {
		
		Connection connection = null;
		Statement selectStatement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online","root","Toamna2000");

			selectStatement = connection.createStatement();
			selectStatement.execute(c.instructiune);
			rs = selectStatement.getResultSet();
			
			while(rs.next()) {
				c.emails.add(rs.getString("adresa_email"));
				c.parola.add(rs.getString("parola_client"));
				
			}
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (selectStatement != null) {
				try {
					selectStatement.close();
				} catch (SQLException e) {
				}
				selectStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}
		//System.out.println(c.parola);
		return c;
	}

	public Produs statements1(Produs p) {

		Connection connection = null;
		Statement selectStatement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online", "root", "Toamna2000");

			selectStatement = connection.createStatement();
			selectStatement.execute(p.instructiune);
			rs = selectStatement.getResultSet();

			while (rs.next()) {
				p.produse.add(rs.getString("nume_produs"));
				p.pret.add(rs.getInt("pret"));
				p.firma.add(rs.getString("firma"));
				p.cantitate = rs.getInt("cantitate");
				p.idProdus.add(rs.getInt("id_produs"));

			}
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (selectStatement != null) {
				try {
					selectStatement.close();
				} catch (SQLException e) {
				}
				selectStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}

		return p;
	}


public Produs statements2(Produs p) {
		
		String s=null;
		Connection connection = null;
		Statement selectStatement = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online","root","Toamna2000");

			selectStatement = connection.createStatement();
			selectStatement.execute(p.instructiune);
			rs = selectStatement.getResultSet();
			
			while(rs.next()) {
				p.firma.add(rs.getString("firma"));	
			}
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (selectStatement != null) {
				try {
					selectStatement.close();
				} catch (SQLException e) {
				}
				selectStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}
		
		return p;
	}

	public Obiect statements(Obiect o) {

		Connection connection = null;
		Statement selectStatement = null, insertStatement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online", "root", "Toamna2000");

			selectStatement = connection.createStatement();
			selectStatement.execute(o.instructiune);
			rs = selectStatement.getResultSet();
			// System.out.println("\tNume: " + rs.getString("nume_client"));

			while (rs.next()) {
				// System.out.println("\tNume: " + rs.getString("nume_magazin"));
				o.setReturnat(rs.getString(o.returnat));
			}
		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (selectStatement != null) {
				try {
					selectStatement.close();
				} catch (SQLException e) {
				}
				selectStatement = null;
			}
			if (insertStatement != null) {
				try {
					insertStatement.close();
				} catch (SQLException e) {
				}
				insertStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}

		return o;
	}

	public void conectare() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.err.println("An Exception occured during JDBC Driver loading." + " Details are provided below:");
			ex.printStackTrace(System.err);
		}
	}

	public void statements2(String instructiune) {

		Connection connection = null;
		Statement insertStatement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online", "root", "Toamna2000");

			insertStatement = connection.createStatement();
			insertStatement.execute(instructiune);

		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (insertStatement != null) {
				try {
					insertStatement.close();
				} catch (SQLException e) {
				}
				insertStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}

	}

	public int statements4() {

		Connection connection = null;
		Statement insertStatement = null;
		ResultSet rs = null;
        int nrRows = 0;
        
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/magazin_de_cosmetice_online", "root", "Toamna2000");

			insertStatement = connection.createStatement();
			insertStatement.execute("SELECT * FROM factura");
			rs = insertStatement.getResultSet();
			
			while(rs.next()) {
				
				nrRows ++;
				
			}

		} catch (SQLException sqlex) {
			System.err.println("An SQL Exception occured. Details are provided below:");
			sqlex.printStackTrace(System.err);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
				rs = null;
			}
			if (insertStatement != null) {
				try {
					insertStatement.close();
				} catch (SQLException e) {
				}
				insertStatement = null;
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
				connection = null;
			}
		}
		return nrRows;

	}

}