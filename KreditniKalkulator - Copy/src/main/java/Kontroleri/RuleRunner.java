package Kontroleri;

import DomenskeKlase.*;
import Rezultat.*;

import java.io.*;
import org.drools.*;
import org.drools.compiler.DroolsError;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderErrors;
import org.drools.rule.Package;

public class RuleRunner {
		
	public RuleRunner(){
				
	}
	
	public RuleBase povezivanjeSaPravilima(String ruleFile){
		RuleBase rb = null;
			try{
				Reader source = new InputStreamReader(RuleRunner.class.getResourceAsStream("/"+ruleFile+".drl"));
				Reader rfm = new InputStreamReader(RuleRunner.class.getResourceAsStream("/"+ruleFile+"RF.rfm"));
			
				PackageBuilder pb = new PackageBuilder();
				pb.addPackageFromDrl(source);
				pb.addRuleFlow(rfm);
				Package paket = pb.getPackage();
				
				rb = RuleBaseFactory.newRuleBase();
				rb.addPackage(paket);
				PackageBuilderErrors errors = pb.getErrors();
				DroolsError[] e = errors.getErrors();
				for(int  i = 0; i<e.length;i++){
					System.out.println("Drools error :"+e.toString());
				}
			}catch(Exception e){
				
				System.out.println("(RuleRunner)Greska 55: "+e.getMessage());
				e.printStackTrace();
									
				
			}
			return rb;
	}
	
	
	public Rezultat obradiZahtevRF(Zahtev z, String ruleFile){
		RuleBase ruleBase = povezivanjeSaPravilima(ruleFile);
		WorkingMemory wm = ruleBase.newStatefulSession();
		
		int sgn = 1;
		if(ruleFile.equals("Pravila_Potrosacki")) sgn = 3;
		if(ruleFile.equals("Pravila_AIR")) sgn = 2;
		
		System.out.println("Obrada zahteva....");
		try{
			wm.insert(z);//true
			wm.startProcess(String.valueOf(sgn));
			wm.fireAllRules();
			
		}catch(Exception e){
			return new Rezultat(false, "RuleRunner.obradiZahtev");
		}
		return new Rezultat(true, "Uspesan prolazak kroz pravila");
	}
	
		
}
