package DBBroker;
import DomenskeKlase.OpstiDomenskiObjekat;
import Rezultat.*;
import java.sql.*;

public class DBBroker {

	static Connection con;
	static Statement st;
	
		public Rezultat otvoriBazu(String imeBaze) {
		String Urlbaze;
		try {
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    Urlbaze = "jdbc:odbc:" + imeBaze;
		    con = DriverManager.getConnection(Urlbaze);
		    con.setAutoCommit(false);
		} catch(ClassNotFoundException e) {
		    return new Rezultat(false,"Drajver nije ucitan:" + e);
		} catch(SQLException esql) {
		    return new Rezultat(false,"Greska kod konekcije:" + esql);
		} catch(SecurityException ese) {
		    return new Rezultat(false,"Greska zastite:" + ese);
		}
		return new Rezultat(true,"Uspesno otvorena baza");
	    } 
	    
	    public Rezultat zatvoriBazu(Rezultat r)  { 
	                    try { 
	                    	st.close();//mozda bi ovde uhvatio exc ali ne zna koji
	                        con.close();
	                        
	                        
	                    } catch(Exception e) {
	                         r.setPoruka(r.getPoruka()+"\nGreska kod zatvaranja baze");
	                         r.setOk(false);
	                         return r;
	                    }
	        r.setPoruka(r.getPoruka()+"\nUspesno zatvorena baza");
	        r.setOk(true);
	        return r;
	    }
	    
	    public Rezultat commitTransakcije(Rezultat r) {
	    	try{ 
	                con.commit();
	            } catch(SQLException esql) {
	            	r.setPoruka(r.getPoruka()+"\nNeuspesan commit");
	            	return r;
	    	}
	        
	        r.setPoruka(r.getPoruka()+"\nUspesan commit");
	    	return r;
	        }
	    
	    public Rezultat rollbackTransakcije(Rezultat r) {
	    	try{ 
	                con.rollback();
	            } catch(SQLException esql) {
	            	r.setPoruka(r.getPoruka()+"\nNeuspesan rollback/sistem u nestabilnom stanju");
	            	
	            	return r;
	    	}
	            r.setPoruka(r.getPoruka()+"\nUradjen rollback");            	
            	return r;
	        }
	    
	       
	    public Rezultat vratiSlogove(String tab, OpstiDomenskiObjekat odo){
	    	String upit = "SELECT * FROM "+tab+" WHERE "+odo.vratiUslovZaNadjiSlog(tab);
	    	Rezultat r = null;
	    	
	    	try{
	    	st = con.createStatement();
	    	ResultSet rs = st.executeQuery(upit);
	    	
	    	
	    	r = odo.obradiRS(tab,rs);
	    	//st.close
	    	}catch(SQLException s){
	    		System.out.println("GR6 :: DBB : vratiSlogove");
	    		s.printStackTrace();
	    		return new Rezultat(false, "GR :: DBB.vratiSlogove");
	    		
	    	}
	    	
	    	return r;
	    }
	    
	   public ResultSet vratiSlog(OpstiDomenskiObjekat odo,Rezultat r){
		   String upit = "SELECT * FROM "+odo.vratiTab()+" WHERE "+odo.vratiUslovZaNadjiSlog(odo.vratiTab());
	    	r = new Rezultat(true);
	    	ResultSet rs = null;
	    	try{
	    	
	    	st = con.createStatement();
	    	rs = st.executeQuery(upit);    	    	
	    			
	    	r.setPoruka("Uspesno citanje iz baze");
	    	}catch(SQLException s){
	    		s.printStackTrace();
	    		r.setOk(false);
	    		r.setPoruka(r.getPoruka()+"\nNeuspesno citanje iz baze");
	    		return rs;
	    		
	    	}
	    	
	    	return rs;
	   }
	    
	    public Rezultat sacuvajSlog(OpstiDomenskiObjekat o){
	    	String tab = o.vratiTab();	    	
	    	String upit = "INSERT INTO "+tab+"("+o.vratiNaziveKolona()+") VALUES("+o.vratiVrednostiAtributa()+")";
	    	//System.out.println(upit);
	    	try{
	    		st = con.createStatement();
	    		st.executeUpdate(upit);
	    		
	    		//st.close();
	    	}catch(SQLException e){
	    		System.out.println("GRESKA sacuvajSlog :: "+e.getMessage());
	    		e.printStackTrace();
	    		return new Rezultat(false, "Neuspesno upisivanje u bazu");
	    	}
	    	
	    	return new Rezultat(true, "Uspesno upisivanje u bazu");
	    }
	    
	    public Rezultat izbrisiSlog(OpstiDomenskiObjekat o){
	    	String tab = o.vratiTab();
	    	String upit = "DELETE FROM "+tab+" WHERE "+o.vratiUslovZaNadjiSlog(tab);
	    	//System.out.println(upit);
	    	try{
	    	st = con.createStatement();
	    	st.execute(upit);
	    	}catch(SQLException e){
	    		
	    		return new Rezultat(false, "Greska kod brisanja iz baze");
	    	}
	    	return new Rezultat(true, "Uspesno brisanje");
	    }
	    
	    public Rezultat izmeniSlog(OpstiDomenskiObjekat o){
	    	
	    	return new Rezultat(false);
	    }
	    public Rezultat vratiPoslednji(OpstiDomenskiObjekat o){
	    	String upit = "SELECT Max(" + o.vratiAtributPretrage()+ " ) AS Max" +
		    " FROM " + o.vratiTab();
	    	ResultSet rs = null;
	    	try{
	    		st = con.createStatement();
	    		rs = st.executeQuery(upit);
	    		o.setPoslednji(rs);
	    	}catch(SQLException e){
	    		System.out.println("GRESKA vratiPoslednji");
	    		e.printStackTrace();
	    		return new Rezultat(false,"Neuspesno pronalazenje poslednjeg sloga");
	    	}
	    return new Rezultat(true,"Uspesno pronadjen poslednji slog");
	    }
}
