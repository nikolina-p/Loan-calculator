package Kontroleri;
import javax.swing.*;

//import java.sql.Date;

import DomenskeKlase.*;
import Interface.BrisanjeKomintenta_FRM;
import Interface.FizickoLice_FRM;
import Interface.IzmenaKomintena_FRM;
import Interface.Izvestaj_FRM;
import Interface.Komintent_FRM;

import Interface.Odobravanje_FRM;
import Interface.Provera_FRM;
import Interface.UnosKomintenta_FRM;

import Rezultat.*;

import java.awt.Color;
import java.util.Calendar;

//import java.util.Date;


public class KontrolerKI {
	
	public KomintentFizickoLice k = null;	
	
		public KontrolerKI(){
			
		}
		
		//1.SO
		public Rezultat pronadjiKomitenta(Provera_FRM p,String jmbg){
			k = new KomintentFizickoLice(jmbg);
			Rezultat r = Facade.pronadjiKomitenta(k);
			if(r.isOk()){
				if(k.getImePrezime()!= null){
					r.setPoruka("Komintent postoji u bazi");
					
					FizickoLice_FRM fl = new FizickoLice_FRM(this);
					fl.getJContentPane();
					fl.getImePrezime_JLabel().setText(k.getImePrezime());
					fl.getJmbg_jLabel6().setText(k.getJmbg());
					fl.getZanimanje_jLabel5().setText(k.getZanimanje());
					fl.getMesPrihod_jLabel1().setText(String.valueOf(k.getMesecniPrihod()));
					fl.getDatRodjenjajLabel5().setText(k.getDatumRodjenja());
					fl.getAdresa_jLabel7().setText(k.getAdresaPreb());
					
					fl.getJFrame().setVisible(true);
					p.setVisible(false);
				}else{
					r.setOk(false);
					r.setPoruka("komintent ne postoji u bazi");
				}
			}
			return r;
			
		}
		
		// 1.SO    1.SK: unos komintenta
		public Rezultat pronadjiKomintenta(Komintent_FRM ko,UnosKomintenta_FRM uk, JTextField jmbgtxt){
			String jmbg = jmbgtxt.getText();
			KomintentFizickoLice k = new KomintentFizickoLice(jmbg);
			Rezultat r = Facade.pronadjiKomitenta(k);
			if(r.isOk()){
				if(k.getImePrezime()!=null){
					JOptionPane.showMessageDialog(ko.getContentPane(),"Komitent vec postoji u bazi!","OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
				}else{
					uk.getJMBG_jLabel().setText(k.getJmbg());
					uk.setVisible(true);
					ko.setVisible(false);
				}
			}
			
			return r;
		}
		
		//1.SO     2.SK: izmena komitenta
		public Rezultat pronadjiKomitenta(Komintent_FRM ko,IzmenaKomintena_FRM ik,  JTextField jmbg){
			KomintentFizickoLice k = new KomintentFizickoLice(jmbg.getText());		
			Rezultat r = Facade.pronadjiKomitenta(k);
			if(r.isOk()){
				if(k.getImePrezime()==null){
					JOptionPane.showMessageDialog(ko.getContentPane(),"Komitent ne postoji u bazi!","OBAVESTENJE", JOptionPane.ERROR_MESSAGE);
				}else{
					ik.getJMBG_jLabel1().setText(k.getJmbg());
					ik.getIme_jTextField().setText(k.getImePrezime());
					ik.getDatRodj_jLabel4().setText(k.getDatumRodjenja());
					ik.getZanimanje_jComboBox().setSelectedItem(k.getZanimanje());
					ik.getMesPrihod_jTextField().setText(String.valueOf(k.getMesecniPrihod()));
					int[] dat = parseDat(k.getDatZaposlenja());
					if(k.getZanimanje().equals("ZAPOSLEN")){
						ik.getDamZapos_jTextField().setText(String.valueOf(dat[0]));
						ik.getMesZapos_jTextField().setText(String.valueOf(dat[1]));
						ik.getGodZapos_jTextField().setText(String.valueOf(dat[2]));						
						ik.getDanFrmOsn_jTextField().setEnabled(false);
						ik.getMesFrmOsn_jTextField().setEnabled(false);
						ik.getGodFrmOsn_jTextField().setEnabled(false);
					}
					if(k.getZanimanje().equals("PREDUZETNIK") || k.getZanimanje().equals("POLJOPRIVREDNIK")){
						ik.getDanFrmOsn_jTextField().setText(String.valueOf(dat[0]));
						ik.getMesFrmOsn_jTextField().setText(String.valueOf(dat[1]));
						ik.getGodFrmOsn_jTextField().setText(String.valueOf(dat[2]));
						ik.getDamZapos_jTextField().setEnabled(false);
						ik.getMesZapos_jTextField().setEnabled(false);
						ik.getGodZapos_jTextField().setEnabled(false);						
					}	
					if(k.getZanimanje().equals("PENZIONER")){
						ik.getDamZapos_jTextField().setEnabled(false);
						ik.getMesZapos_jTextField().setEnabled(false);
						ik.getGodZapos_jTextField().setEnabled(false);	
						ik.getDanFrmOsn_jTextField().setEnabled(false);
						ik.getMesFrmOsn_jTextField().setEnabled(false);
						ik.getGodFrmOsn_jTextField().setEnabled(false);
					}
					
					ik.getAdresa_jTextField().setText(k.getAdresaPreb());
					int[] dat2 = parseDat(k.getDatPreseljenja());
					ik.getDanAdres_jTextField().setText(String.valueOf(dat2[0]));
					ik.getMesAdresa_jTextField().setText(String.valueOf(dat2[1]));
					ik.getGodAdresa_jTextField().setText(String.valueOf(dat2[2]));
					
					ik.getNejRadioButton().setSelected(true);
					if(k.isDrzavljaninRS()) ik.getDajRadioButton().setSelected(true);
					
					ik.setVisible(true);
					ko.setVisible(false);
				}
			}
			
			return r;
		}
		
		//1.SO  3.SK: brisanje komitenta
		public void pronadjiKomitenta(Komintent_FRM kf){
			KomintentFizickoLice k = new KomintentFizickoLice(kf.getJMBG_jTextField().getText());
			Rezultat r = Facade.pronadjiKomitenta(k);
			if(r.isOk()){
				if(k.getImePrezime()==null){
					JOptionPane.showMessageDialog(kf.getContentPane(),"Komitent ne postoji u bazi!","OBAVESTENJE", JOptionPane.ERROR_MESSAGE);
				}else{
					BrisanjeKomintenta_FRM bk = new BrisanjeKomintenta_FRM();
					bk.getJmbg_jLabel1().setText(k.getJmbg());
					bk.getImePrezime_jLabel2().setText(k.getImePrezime());					
					
					bk.setVisible(true);
					kf.setVisible(false);
				}
			}
		}
		
		//7.SO 5.SK: unos kreditnog zaduzenja
		public Rezultat pronadjiZahtev(int id){
					
			Zahtev z = new Zahtev(id);
			Rezultat r = Facade.pronadjiZahtev(z);
			
			if(!r.isOk()){ 
				return r;				
			}else{
				if(z.getKredit().getIznosKredita() == 0){
					r.setOk(false);
					return r;
				}else{
				Odobravanje_FRM o = new Odobravanje_FRM();
				o.getContentPane();
				o.getVrstaKred_jLabel().setText(z.getKredit().getVrstaKredita());
				o.getStanje_jLabel().setText("ODOBREN");
				o.getStanje_jLabel().setForeground(Color.BLUE);
				if(!z.isStanje()){
					o.getStanje_jLabel().setText("ODBIJEN");
					o.getStanje_jLabel().setForeground(Color.RED);
					o.getOkjButton().setEnabled(false);
				}
				o.getSifVlasnika_jLabel().setText(z.getKomitent().getJmbg());
				o.getIznos_jLabel().setText(String.valueOf(z.getKredit().getIznosKredita()));
				o.getZahtevID_jLabel().setText(String.valueOf(z.getZahtevID()));
				o.getRokOtplatejLabel7().setText(String.valueOf(z.getKredit().getRokOtplateGod()));
				o.getValuta_jLabel6().setText(z.getKredit().getValuta());
				o.getProfak_jLabel8().setText(String.valueOf(z.getKredit().getPokrivenostProfakturama()*100));
				o.getDepozit_jLabel9().setText(String.valueOf(z.getKredit().getDepozit()*100));
				o.getOsigNKOSKjLabel10().setText(String.valueOf(z.getKredit().isOsiguranjeNKOSK()));
				o.getGrejs_jLabel11().setText(String.valueOf(z.getKredit().getGrejsPeriod()));
				o.getHipo_jLabel13().setText(String.valueOf(z.getKredit().getVrednostHipo()));
				o.getZirant_jLabel12().setText(String.valueOf(z.getKredit().isZirant()));
				 System.out.println("M.Rata :::: "+z.getKredit().getMesRata());
				o.setMesecnaRata(String.valueOf(z.getKredit().getMesRata()));
				o.setVisible(true);
				
				return r;
			}
			}
			
		}
		
		//  1. SLUCAJ KORISCENJA
		public Rezultat unesiKomitenta(UnosKomintenta_FRM uk){
			KomintentFizickoLice k = new KomintentFizickoLice(uk.getJMBG_jLabel().getText());
			
			k.setImePrezime(uk.getIme_jTextField().getText()+""+uk.getPrezime_jTextField().getText());
			k.setAdresaPreb(uk.getAdresaPreb_jTextField().getText());
			k.setZanimanje(uk.getZanimanje_jComboBox().getSelectedItem().toString());
			try{
				k.setMesecniPrihod(Double.parseDouble(uk.getMesecniPrihod_jTextField().getText()));
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(uk.getContentPane(), "U polje mesecni prihod niste unelu broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			
			
			int[] nizDatRodj = new int[3];
			boolean b = proveraDatuma(uk, uk.getDatumRodjDan_jTextField(), uk.getDatRodjMesec_jTextField(),uk.getDatumRodjGod_jTextField(), nizDatRodj);
			if(!b){
				JOptionPane.showMessageDialog(uk.getContentPane(), "Nekorektan podatak u polju Datum rodjenja", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;
				} 
			int[] nizDatPreselenja = new int[3];
			boolean c1 = proveraDatuma(uk, uk.getDan_jTextField(), uk.getMesec_jTextField(), uk.getGod_jTextField(), nizDatPreselenja);
			if(c1 == false){
				JOptionPane.showMessageDialog(uk.getContentPane(), "Nekorektan podatak u polju Datum preselenja", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			
			String datRodj = String.valueOf(nizDatRodj[0])+"/"+String.valueOf(nizDatRodj[1])+"/"+String.valueOf(nizDatRodj[2]);
			String datPrese = String.valueOf(nizDatPreselenja[0])+"/"+String.valueOf(nizDatPreselenja[1])+"/"+String.valueOf(nizDatPreselenja[2]);
			
			k.setDatumRodjenja(datRodj);
			k.setDatPreseljenja(datPrese);
			
			int[] datPocetakRada = new int[3];
			String datZaposljavanja = "";
			if(k.getZanimanje().equals("PREDUZETNIK")||k.getZanimanje().equals("POLJOPRIVREDNIK")){
			boolean z1 = proveraDatuma(uk, uk.getPocetakPoslovanjaDan_jTextField(), uk.getPocetakPoslovanjaMes_jTextField(),uk.getPocetakPoslovanjaGod_jTextField(), datPocetakRada);
			if(z1==false){
				JOptionPane.showMessageDialog(uk.getContentPane(), "Nekorektan podatak u polju Datum zaposlenja", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;				
			}
			datZaposljavanja = datPocetakRada[0]+"/"+datPocetakRada[1]+"/"+datPocetakRada[2];
			}
			if(k.getZanimanje().equals("ZAPOSLEN")){
				boolean z2 = proveraDatuma(uk, uk.getZaposlenOdDan_jTextField(), uk.getZaposlenOdMesec_jTextField(),uk.getZaposlenOdGod_jTextField(), datPocetakRada);
				if(z2==false){
					JOptionPane.showMessageDialog(uk.getContentPane(), "Nekorektan podatak u polju Datum zaposlenja", "GRESKA", JOptionPane.ERROR_MESSAGE);
					return null;				
				}
				datZaposljavanja = datPocetakRada[0]+"/"+datPocetakRada[1]+"/"+datPocetakRada[2];
			}
			k.setDatZaposlenja(datZaposljavanja);
			if(uk.getDa_jRadioButton().isSelected()==false && uk.getNe_jRadioButton().isSelected()==false){
				JOptionPane.showMessageDialog(uk.getContentPane(), "Izabrati drzavljanstvo", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			k.setDrzavljaninRS(false);
			if(uk.getDa_jRadioButton().isSelected())k.setDrzavljaninRS(true);
			
			Rezultat r = Facade.unosKomitenta(k);
			if(r.isOk()){
				JOptionPane.showMessageDialog(uk,"Komintent uspesno zapamcen u bazi", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
				uk.setVisible(false);
			}else{JOptionPane.showMessageDialog(uk.getContentPane(), r.getPoruka(), "GRESKA", JOptionPane.ERROR_MESSAGE);}
			return r;
		}
		
		// 2. SLUCAJ KORISCENJA
		public Rezultat izmenaKomitenta(IzmenaKomintena_FRM ik){
			KomintentFizickoLice k = new KomintentFizickoLice();
			
			k.setJmbg(ik.getJMBG_jLabel1().getText());
			k.setImePrezime(ik.getIme_jTextField().getText());
			k.setDatumRodjenja(ik.getDatRodj_jLabel4().getText());
			k.setAdresaPreb(ik.getAdresa_jTextField().getText());
			k.setZanimanje(ik.getZanimanje_jComboBox().getSelectedItem().toString());
			try{
				k.setMesecniPrihod(Double.parseDouble(ik.getMesPrihod_jTextField().getText()));
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(ik.getContentPane(), "U polje mesecni prihod niste unelu broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return new Rezultat(false, "Greska!");
			}
			
			k.setDrzavljaninRS(false);
			if(ik.getDajRadioButton().isSelected())k.setDrzavljaninRS(true);
			
			int[] nizDatPres = new int[3];
			boolean c =	proveraDatuma(ik, ik.getDanAdres_jTextField(), ik.getMesAdresa_jTextField(), ik.getGodAdresa_jTextField(), nizDatPres );
					if(!c){
						JOptionPane.showMessageDialog(ik, "Nekorektan podatak: datum preselenja", "GRESKA",JOptionPane.ERROR_MESSAGE);
						return new Rezultat(false);
					}
			
			String datPreselenja = String.valueOf(nizDatPres[0])+"/"+String.valueOf(nizDatPres[1])+"/"+String.valueOf(nizDatPres[2]);
			k.setDatPreseljenja(datPreselenja);
			
			int[] datPocetakRada = new int[3];
			String datZaposljavanja = "";
					if(k.getZanimanje().equals("PREDUZETNIK")||k.getZanimanje().equals("POLJOPRIVREDNIK")){
					boolean m = proveraDatuma(ik, ik.getDanFrmOsn_jTextField(), ik.getMesFrmOsn_jTextField(),ik.getGodFrmOsn_jTextField(), datPocetakRada);
					if(!m){
						JOptionPane.showMessageDialog(ik, "Nekorektan podatak: datum zaposlenja", "GRESKA",JOptionPane.ERROR_MESSAGE);
						return new Rezultat(false);
					}					
					datZaposljavanja = datPocetakRada[0]+"/"+datPocetakRada[1]+"/"+datPocetakRada[2];
					}
					
			if(k.getZanimanje().equals("ZAPOSLEN")){
				boolean m = proveraDatuma(ik, ik.getDamZapos_jTextField(), ik.getMesZapos_jTextField(),ik.getGodZapos_jTextField(), datPocetakRada);
				if(!m){
					JOptionPane.showMessageDialog(ik, "Nekorektan podatak: datum zaposlenja", "GRESKA",JOptionPane.ERROR_MESSAGE);
					return new Rezultat(false);
				}
				
				datZaposljavanja = datPocetakRada[0]+"/"+datPocetakRada[1]+"/"+datPocetakRada[2];
			}
			
			k.setDatZaposlenja(datZaposljavanja);
			
			Rezultat r = Facade.izmeniKomitenta(k);
			if(!r.isOk()){
				JOptionPane.showMessageDialog(ik,r.getPoruka(),"GRESKA", JOptionPane.ERROR_MESSAGE);
				ik.setVisible(false);
				return r;
			}
			JOptionPane.showMessageDialog(ik,"Uspesno izvrsena transakcija", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
			ik.setVisible(false);
			return r;
		}
		
		//3.SLUCAJ KORISCENJA
		public void brisanjeKomitenta(BrisanjeKomintenta_FRM bk){
			KomintentFizickoLice k = new KomintentFizickoLice(bk.getJmbg_jLabel1().getText());
			Rezultat r = Facade.brisanjeKomitenta(k);
			if(!r.isOk()){
				JOptionPane.showMessageDialog(bk,r.getPoruka(),"GRESKA", JOptionPane.ERROR_MESSAGE);
				bk.setVisible(false);
			}
			JOptionPane.showMessageDialog(bk,"Uspesno brisanje sloga", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
			bk.setVisible(false);
		}
		
		
		//   4.SLUCAJ KORISCENJA
		public Rezultat proveraFizickogLica(FizickoLice_FRM fl){			
			Kredit kredit = null;
			Izvestaj izvestaj = null;
			Rezultat r = new Rezultat(false);
			if(proveraPodataka(fl)){			
					k = vratiKomitenta(fl);						
					kredit = vratiKredit(fl);			
					
					izvestaj = new Izvestaj();
					Zahtev zahtev =new Zahtev(kredit,k,izvestaj);
					
					r = Facade.proveraFizickogLica(zahtev);					
					
					if(r.isOk()){
						r.setPoruka("Uspesno izvrsena transakcija");
						fl.getJFrame().setVisible(false);
						Izvestaj_FRM iz = new Izvestaj_FRM();
						izvestajFL(iz, zahtev);
					}else{
						JOptionPane.showMessageDialog(fl.getJFrame(),r.getPoruka(),"GRESKA",JOptionPane.ERROR_MESSAGE);
						fl.getJFrame().setVisible(false);
					}
			}else{
				r.setPoruka("Nekorektan unos podataka");
			}
			
			return r;
		}
		
		
		//5.SLUCAJ KORISCENJA
		public Rezultat sacuvajKredit(Odobravanje_FRM o){
			int zid = 0; //id zahteva
			try{
				zid = Integer.parseInt(o.getZahtevID_jLabel().getText());
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(o.getContentPane(), "Ocekivana brojcana vrednost", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			Zahtev z  = new Zahtev(zid);
			
			
			try{
			z.getKredit().setIznosKredita(Double.parseDouble(o.getIznos_jLabel().getText()));
			z.getKredit().setPokrivenostProfakturama(Double.parseDouble(o.getProfak_jLabel8().getText()));
			z.getKredit().setRokOtplateGod(Integer.parseInt(o.getRokOtplatejLabel7().getText()));
			z.getKredit().setDepozit(Double.parseDouble(o.getDepozit_jLabel9().getText())/100);
			
			z.getKredit().setGrejsPeriod(Integer.parseInt(o.getGrejs_jLabel11().getText()));
			z.getKredit().setVrednostHipo(Double.parseDouble(o.getHipo_jLabel13().getText()));
			}catch(NumberFormatException n){
				System.out.println("GRESKA: NumFormExc( greska u kastovanju )");
			}
			z.getKredit().setVrstaKredita(o.getVrstaKred_jLabel().getText());
			z.getKomitent().setJmbg(o.getSifVlasnika_jLabel().getText());
			z.getKredit().setSifVlasnika(z.getKomitent().getJmbg());
			z.getKredit().setStanje(0);
			z.getKredit().setValuta(o.getValuta_jLabel6().getText());
				boolean sgn = false;
				if(o.getOsigNKOSKjLabel10().getText().equals("true")) 
					sgn = true;
			z.getKredit().setOsiguranjeNKOSK(sgn);
				boolean sgnn = false;
				if(o.getZirant_jLabel12().getText().equals("true"))
					sgnn = true;
			z.getKredit().setZirant(sgnn);
			z.getKredit().setMesRata(Double.parseDouble(o.getMesecnaRataIznos().getText()));
			if(o.getStanje_jLabel().getText().equals("ODOBREN")) z.getKredit().setStanje(1);
			
			Rezultat r = Facade.sacuvajKredit(z);
			if(r.isOk()){
				JOptionPane.showMessageDialog(o, "Uspesno izvrsena transakcija", "OBAVESTENJE",JOptionPane.INFORMATION_MESSAGE);
				o.setVisible(false);
			}
			return r;
		}
		
		public KomintentFizickoLice vratiKomitenta(FizickoLice_FRM fl){
			
			int brClanovaDom = 0;
			try{
				brClanovaDom = Integer.parseInt(fl.getBrClanovaDom_jTextField().getText());
				
			}catch(NumberFormatException nf){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Broj clanova domacinstva niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);return null;}
			
			int brZaposlenihCl = 0;
			try{
				brZaposlenihCl = Integer.parseInt(fl.getBrZaposlenih_jTextField().getText());
				
			}catch(NumberFormatException nf){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Broj zaposlenih clanova niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);return null;}
			
			
			
			boolean klijentBanke = false;
			if(fl.getDa_jRadioButton().isSelected()){
				klijentBanke = true;
				}
			
			//DRUGI KREDIT...
			boolean drugiKredit = false;
			if(fl.getDaKred_jRadioButton().isSelected()){
				drugiKredit = true;
			}			
			double rataDrugiKred = 0;			
			if(drugiKredit){
			rataDrugiKred = Double.parseDouble(fl.getMesecnaRata_jTextField().getText());
				if(((String)fl.getValutaDrugiKr_jComboBox1().getSelectedItem()).equals("EUR")){
					rataDrugiKred = rataDrugiKred*80;
				}
			
			}
			k.setBrClanovaDom(brClanovaDom);			
			k.setBrZaposlenih(brZaposlenihCl);
			k.setDrugaKredZaduzenost(drugiKredit);
			k.setMesRataDrugogKred(rataDrugiKred);
			k.setKlijentBanke(klijentBanke);
			//ZAPOSLENI CLANOVI DOMACINSTVA		 
			if(brZaposlenihCl >0) {
				double mesPrihodPrvi = Double.parseDouble(fl.getPrviMesPrihod_jTextField().getText());
				String imePrezime = fl.getPrviImePrezime_jTextField().getText();
				FizickoLice f1 = new FizickoLice(imePrezime,mesPrihodPrvi);
				k.addZaposleniClan(f1);
			}
			if(brZaposlenihCl > 1){
			double mesPrihoddrugi = 0;
			mesPrihoddrugi = Double.parseDouble(fl.getDrugiMesPrihod_jTextField().getText());
			String imeprez = fl.getDrugiImePrez_jTextField().getText();
			FizickoLice f2 = new FizickoLice(imeprez, mesPrihoddrugi);
			k.addZaposleniClan(f2);
			}
			
			return k;
		}

		public Kredit vratiKredit(FizickoLice_FRM fl){
			
			String vrstaKred = fl.getVrstaKredita_jComboBox().getSelectedItem().toString();			
			String valuta = (String)fl.getValuta_jComboBox().getSelectedItem();
			
			int rokOtplateGod = Integer.parseInt(fl.getRokOtplate_jTextField().getText());				
			
			
			double iznos = Double.parseDouble(fl.getIznosKredita_jTextField().getText());
			if(valuta.equals("EUR")){
				iznos = iznos*80;
			}
			double proFak = 0;
			if(fl.getPokrivenostProFak_jTextField().isEnabled()==true){
			proFak = Double.parseDouble(fl.getPokrivenostProFak_jTextField().getText());
			}			
			boolean osig = false;
			if(fl.getDaOsig_jRadioButton().isSelected()) osig = true;
			
						Kredit k = new Kredit(rokOtplateGod,iznos,valuta,vrstaKred,osig);
			
			k.setPokrivenostProfakturama(proFak);
			
			k.setZeljeniRokOtpalte(rokOtplateGod);
			
			return k;
		}
		
		public boolean proveraPodataka(FizickoLice_FRM fl){
			//ROK OTPLATE
			try{
				Integer.parseInt(fl.getRokOtplate_jTextField().getText());
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Rok otplate niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			//IZNOS
			try{
				Double.parseDouble(fl.getIznosKredita_jTextField().getText());
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Iznos kredita niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			//pokrivenost profakturama
			double proFak = 0;
			if(fl.getPokrivenostProFak_jTextField().isEnabled()==true){
			try{
				proFak = Double.parseDouble(fl.getPokrivenostProFak_jTextField().getText());
				if(proFak>100){
					JOptionPane.showMessageDialog(fl.getJFrame(), "Nepravilan unos u polje pokrivenost profakturama","GRESKA",JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(fl.getJFrame(), "U polje pokrivenost profakturama niste uneli broj","GRESKA",JOptionPane.ERROR_MESSAGE);
				return false;
			}
			}
			
			//BROJ CLANOVA DOMACINSTVA
				int brClanovaDom = 0;
			try{
				brClanovaDom = Integer.parseInt(fl.getBrClanovaDom_jTextField().getText());
				if(brClanovaDom < 0){
					JOptionPane.showMessageDialog(fl.getJFrame(), "Negativan broj clanova domacinstva!!", "GRESKA", JOptionPane.ERROR_MESSAGE);
					return false;
				}	
			}catch(NumberFormatException nf){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Broj clanova domacinstva niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
			return false;}
			//BROJ ZAPOSLENIH CLANOVA DOMACINSTVA
			int brZaposlenihCl = 0;
			try{
				brZaposlenihCl = Integer.parseInt(fl.getBrZaposlenih_jTextField().getText());
				if(brZaposlenihCl < 0 || brZaposlenihCl > brClanovaDom){
					JOptionPane.showMessageDialog(fl.getJFrame(), "Nekorektan podatak :: Broj zaposlenih clanova", "GRESKA", JOptionPane.ERROR_MESSAGE);
					return false;				
				}
			}catch(NumberFormatException nf){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Broj zaposlenih clanova niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
			return false;}
			//MESECNII PRIHOD PRVI
			if(brZaposlenihCl > 0){
			try{
				double mesPrihod = Double.parseDouble(fl.getPrviMesPrihod_jTextField().getText());
				if(mesPrihod < 0){
					JOptionPane.showMessageDialog(fl.getJFrame(), "Mesecni prihod ne moze biti negativan\n(prvi clan domacinstva)", "GRESKA", JOptionPane.ERROR_MESSAGE);
					return false;
				}
				}catch(NumberFormatException n){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Mesecni prihod (prvi clan domacinstva) niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return false;}
			}
			//MESECNNI PRIHOD DRUGI
				if(brZaposlenihCl > 1){
				try{
					double mesPrihod = Double.parseDouble(fl.getDrugiMesPrihod_jTextField().getText());
					if(mesPrihod < 0){
						JOptionPane.showMessageDialog(fl.getJFrame(), "Mesecni prihod ne moze biti negativan\n(drugi clan domacinstva)", "GRESKA", JOptionPane.ERROR_MESSAGE);
						return false;
					}
					}catch(NumberFormatException n){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Mesecni prihod (drugi clan domacinstva) niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
					return false;}
				}
			//MESECNA RATA DRUGOG KREDITA
				if(fl.getDaKred_jRadioButton().isSelected()){
					try{
						double rataDrugiKred = Double.parseDouble(fl.getMesecnaRata_jTextField().getText());
						if(rataDrugiKred < 0){
							JOptionPane.showMessageDialog(fl.getJFrame(), "Neorektan podatak :: rata drugog kredita", "GRESKA", JOptionPane.ERROR_MESSAGE);
							return false;
						}
						}catch(NumberFormatException n){JOptionPane.showMessageDialog(fl.getJFrame(), "U polje Rata dugog kredita niste uneli broj", "GRESKA", JOptionPane.ERROR_MESSAGE);
						return false;}
				}
			
			return true;
		}
		
		//uzima txtField-ove i proverava da li su podaci dobro uneti i vraca datum u obliku niz[dan,mesec,godina]
		public boolean proveraDatuma(JFrame f,JTextField danTXT, JTextField mesTXT, JTextField godTXT, int[] niz){
				
				int dani =0;
				int meseci = 0;
				int god = 0;
				boolean prestupna = false;
												
				try{
					
				god = Integer.parseInt(godTXT.getText());
					if((god % 4) == 0) prestupna = true;
					
				
				meseci = Integer.parseInt(mesTXT.getText());
					if(meseci < 1 || meseci >12){						
						//System.out.println("1");
						return false;
						}					
				dani = Integer.parseInt(danTXT.getText());
					if((meseci % 2 == 1 && meseci < 8)||(meseci % 2 == 0 && meseci > 7)){
						if(dani < 1 || dani >31){
							//System.out.println("2");
							return false;
						}
					}	
				//System.out.println("UKUCAN: "+dani+" "+meseci+" "+god);
				//System.out.println("DANAS: "+danasnjiDatum()[0]+" "+danasnjiDatum()[1]+" "+danasnjiDatum()[0]);
					if((meseci % 2 == 0 && meseci < 8)||(meseci % 2 ==1 && meseci > 7)){
						if(dani < 1 || (dani >30 && meseci != 2)){							
							return false;
						}
						if(dani < 1 || (dani > 28 && !prestupna && meseci == 2)){
							
							return false;
						}
						if(dani < 1 || (dani > 29 && prestupna && meseci == 2)){							
							return false;
						}
					}
					//da li je u buducnosti
					if(god>danasnjiDatum()[2]){
						return false;
					}else{
						if(god==danasnjiDatum()[2]&&meseci>danasnjiDatum()[1]){
							return false;
						}else{
							if(god==danasnjiDatum()[2]&&meseci==danasnjiDatum()[1]&& dani>danasnjiDatum()[0]){
								return false;
							}	
						}
						
					}	
					
				}catch(NumberFormatException n){
					return false;
				}
				niz[0] = dani;
				niz[1] = meseci;
				niz[2] = god;
				
				
				return true;
			}

		public int dajStarost(JFrame f,JTextField danTXT, JTextField mesTXT, JTextField godTXT){
			int starost = 0;
					
			int[] niz = new int[3];
			
			if(proveraDatuma(f, danTXT, mesTXT, godTXT, niz)){
				
				starost = razlikaUGodinama(niz);
				if(starost == -1){
					JOptionPane.showMessageDialog(f,"Nekorektni podaci :: datum rodjenja","GRESKA", JOptionPane.ERROR_MESSAGE);
					return -1;
				}
				}else{
					JOptionPane.showMessageDialog(f,"Nekorektni podaci :: datum rodjenja","GRESKA", JOptionPane.ERROR_MESSAGE);
					return -1;
				}
			
			return starost;
		}
		
		
		
		//vraca razliku u godinama izmedju danasnjeg datuma i zadatog datuma, ako je posle vraca -1
		public int razlikaUGodinama(int[] datum){
			int r = 0;
			int[] dDat = danasnjiDatum();
			int dd = dDat[0];
			int dm = dDat[1];
			int dg = dDat[2];
			
			int dan = datum[0];
			int mesec = datum[1];
			int god = datum[2];
			
			//problem sa buducnosti
			if(dg < god || (dg == god && dm < mesec)||(dg == god && dm == mesec && dd < dan))
			{
				System.out.println("Datum je posle danasnjeg datuma");
				return -1;
			}
			r = dg-god;
			if(dm > mesec||(dm == mesec && dd<=dan)) r++;
			
			 
			
			return r;
		}
		
		//vraca razliku u mesecima izmedju danasnjeg i zadatog datuma, ako je posle danasnjeg datuma vraca -1
		public int razlikaUMesecima(int[] datum){
			int r = 0;
			int[] dDat = danasnjiDatum();
			int dd = dDat[0];
			int dm = dDat[1];
			int dg = dDat[2];
			
			int dan = datum[0];
			int mesec = datum[1];
			int god = datum[2];
			
			//problem sa buducnosti
			if(dg < god || (dg == god && dm < mesec)||(dg == god && dm == mesec && dd < dan))
			{
				System.out.println("Datum je posle danasnjeg datuma");
				return -1;
			}
			if(dg == god){
						if(dm-1 == mesec){
							if(dd + 31- dan > 31){
								return r = 1;
							}else{
								return r = 0;
							}
						}else{
						if(dm == mesec) {
							return r = 0;
						}else{
							r = dm-mesec;
							int daniUPrvojGod = 31 - dan;
							if(daniUPrvojGod + dd > 30) 
								return r++;
						}
						}
				
			}else{
				r = (dg - god - 1)*12;
			}
			int meseciUPrvojGod = 12 - mesec;
			int meseciUTrenutnojGod = dm - 1;			
			r = r + meseciUPrvojGod + meseciUTrenutnojGod;
			
			int daniUPrvojGod = 31 - dan;
			if(daniUPrvojGod + dd > 30) r++;
			
			return r;
		}
		
		//vraca danasnji datum kao niz[dan, mesec, godima]
		public int[] danasnjiDatum(){
			int[] dd = new int[3];
			
			String danasnjiDatum = Calendar.getInstance().getTime().toString();				
			
			String danasGod = danasnjiDatum.substring(danasnjiDatum.length()-4, danasnjiDatum.length());
			
			int dg = Integer.parseInt(danasGod);
			dd[2] = dg;
			
			int dm = 0;
			String d = danasnjiDatum.substring(4, 7);
			
			if(d.equals("Jan")) dm = 1;
			if(d.equals("Feb")) dm = 2;
			if(d.equals("Mar")) dm = 3;
			if(d.equals("Apr")) dm = 4;
			if(d.equals("May")) dm = 5;
			if(d.equals("Jun")) dm = 6;
			if(d.equals("Jul")) dm = 7;
			if(d.equals("Aug")) dm = 8;
			if(d.equals("Sep")) dm = 9;
			if(d.equals("Oct")) dm = 10;
			if(d.equals("Nov")) dm = 11;
			if(d.equals("Dec")) dm = 12;
			dd[1] = dm;
			
			String danasnjiDan = danasnjiDatum.substring(8, 10);			
			int dDan = Integer.parseInt(danasnjiDan);
			dd[0] = dDan;
			
			return dd;
		}	
		
		public void izvestajFL(Izvestaj_FRM iz, Zahtev z){
			
			if(z.isStanje()){
				iz.getStanjeKredita_jLabel().setText("ODOBREN");
				iz.getStanjeKredita_jLabel().setForeground(Color.GREEN);
				//valjda je odobren
				Kredit k = z.getKredit();
				
				Double d = k.getAnuitet();				
				d*=100;				
				long dlong = Math.round(d);
				d = Double.valueOf(dlong)/100;
				
				Double mr = k.getMesRata();
				mr*=100;
				long mrlong = Math.round(mr);
				mr = Double.valueOf(mrlong)/100;
				
				Double h = k.getVrednostHipo();
				h*=100;
				long hlong = Math.round(h);
				h = Double.valueOf(hlong)/100;
				
				String podaci = "Vrsta kredita :: "+k.getVrstaKredita()+"\nIznos kredita :: "+k.getIznosKredita();
				podaci += "\nRok otplate :: "+k.getRokOtplateGod()+"\nKamata :: "+k.getKamata().getKamata()+"\nDepozit :: "+k.getDepozit(); 
				podaci+="\nGodisnji anuitet :: "+d+"\nMesecna rata :: "+mr+"\nHipoteka :: "+h;
				
				//iz.getLabela1_jLabel().setText("Kredit ODOBREN :: ");
				iz.getJTextArea().setText(podaci);
			
				iz.getKljucniNedostaci_jTextArea().setText(z.getIzvestaj().vratiKljucneNedostatke());
				iz.getKomentari_jTextArea().setText(z.getIzvestaj().vratiKomentare());
				
				
			}else{
				iz.getStanjeKredita_jLabel().setText("ODBIJEN");
				iz.getStanjeKredita_jLabel().setForeground(Color.RED);
				iz.getJTextArea().setText("Klijent ne ispunjava uslove za dati kredit.\nZahtev je odbijen");
				iz.getKljucniNedostaci_jTextArea().setText(z.getIzvestaj().vratiKljucneNedostatke());
				iz.getKomentari_jTextArea().setText(z.getIzvestaj().vratiKomentare());
				
			}						
			//
			//System.out.println("\n\nZAHTEV ID "+String.valueOf(z.getZahtevID())+"\n\n");
			iz.getID_jTextField().setText(String.valueOf(z.getZahtevID()));
			iz.getJFrame().setVisible(true);
		}
		
		public int[] parseDat(String d){
			int[] niz = new int[3];		
			String dan = "";
			String mes = "";
			String god = "";
			
			int br = 0;
			for(int i = 0;i<d.length();i++){
				if(d.charAt(i)=='/' && br == 0){
					dan = d.substring(0,i);
					br=1;
					}else{
							if(d.charAt(i)=='/' && br == 1){
								mes = d.substring(dan.length()+1,i);
								god = d.substring(i+1,d.length());
								}			
			}
			}		
			try{
			niz[0] = Integer.parseInt(dan);
			niz[1] = Integer.parseInt(mes);
			niz[2] = Integer.parseInt(god);
				
			}catch(NumberFormatException e){
				System.out.println("Greska 22: "+e.getMessage());
			}		
			return niz;
		}
}
