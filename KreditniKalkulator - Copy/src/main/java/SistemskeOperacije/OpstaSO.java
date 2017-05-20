package SistemskeOperacije;
import Rezultat.*;
import DBBroker.*;
import DomenskeKlase.*;


public class OpstaSO {
		
	static DBBroker DBBR;
    static Rezultat r;
    static boolean BazaOtvorena = false;
    
    
    public Rezultat opsteIzvrsenjeSO(OpstiDomenskiObjekat odo) {
    	r = new Rezultat(false);  
      	if (!otvoriBazu())   
                return r; 
    	r = izvrsenjeSO(odo);  
    	
    	proveraUspesnostiTransakcije(r);        
    	zatvoriBazu(r);
    	return r;
        }
        
        
        Rezultat izvrsenjeSO(OpstiDomenskiObjekat odo){
            System.out.println("OpstaSistemskaOperacija.izvrsenjeSO");
            return new Rezultat(false);  //   
        }
    
    
    boolean otvoriBazu() {
    	if (BazaOtvorena == false) {
    	    DBBR = new DBBroker();
    	    r = DBBR.otvoriBazu("BANKA"); 
    	    if (!r.isOk())
    		return false;
    	}
    	BazaOtvorena = true;
    	return true;
        }
    
    boolean zatvoriBazu(Rezultat r) {
    	r = DBBR.zatvoriBazu(r); // 61,62
    	if (!r.isOk())
    	    return false;
    	BazaOtvorena = false;
    	return true;
        }
    
    boolean proveraUspesnostiTransakcije(Rezultat r) {
    	if (r.isOk()){
    	    r = DBBR.commitTransakcije(r);
    	    if (!r.isOk())
    		return false;
    	}
    	
    	else{
    	    r=DBBR.rollbackTransakcije(r);
    	    if (!r.isOk())
    		return false;
    	}
    	return true;
        }
}
