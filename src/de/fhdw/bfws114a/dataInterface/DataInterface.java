package de.fhdw.bfws114a.dataInterface;

import java.util.ArrayList;
import java.util.Date;

public class DataInterface {
	public static ArrayList<String> loadUser(){
		//Test
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Samira");
		userList.add("Frank");
		userList.add("Ricardo");
		userList.add("Carsten");
		return userList;
	}
	
	public static ArrayList<String> loadCategories(){
		//Karteien aus xml in mKarteien laden (es muss sichergestellt werden, dass die Anzahl der Karteien = 8 ist (siehe ApplicationLogic --> applyToData()
		//Au�erdem braucht man auch die dazugeh�rige Statistik
		
		//Test
		ArrayList<String> karteien = new ArrayList<String>();
		karteien.add("Biologie");
		karteien.add("Chemie");
		karteien.add("Physik");
		karteien.add("Informatik");
		karteien.add("Sport");
		karteien.add("Technik");
		karteien.add("Geschichte");
		karteien.add("Erdkunde");
		
		return karteien;
	}

	public static ArrayList<StatisticsObject> loadStatistics(ArrayList<String> karteien) {
		
		//Test
		ArrayList<StatisticsObject> statistik= new ArrayList<StatisticsObject>(); 
		StatisticsObject Objekt1 = new StatisticsObject(karteien.get(0), "10", "100");
		statistik.add(Objekt1);
		StatisticsObject Objekt2 = new StatisticsObject(karteien.get(1), "9", "100");
		statistik.add(Objekt2);
		StatisticsObject Objekt3 = new StatisticsObject(karteien.get(2), "2", "100");
		statistik.add(Objekt3);
		StatisticsObject Objekt4 = new StatisticsObject(karteien.get(3), "12", "100");
		statistik.add(Objekt4);
		StatisticsObject Objekt5 = new StatisticsObject(karteien.get(4), "4", "100");
		statistik.add(Objekt5);
		StatisticsObject Objekt6 = new StatisticsObject(karteien.get(5), "14", "100");
		statistik.add(Objekt6);
		StatisticsObject Objekt7 = new StatisticsObject(karteien.get(6), "5", "100");
		statistik.add(Objekt7);
		StatisticsObject Objekt8 = new StatisticsObject(karteien.get(7), "9", "100");
		statistik.add(Objekt8);
		return statistik;
		
	}

	public static ArrayList<Challenge> loadChallenges(String category, String user) {
		ArrayList<Challenge> alleChallenges = new ArrayList<Challenge>();
		String[] antworten = new String[6]; //Hinweise: Es wurde sich mit Herrn Seifert auf max. 6 Antwortm�glichkeiten geeinigt
		int[] korrekteAntworten = new int[6];
		Date zeitstempel = new Date();
		Challenge challenge;
		//laden der Challenges in Abh�ngigikeit der Kartei (category) und des users aus der xml
		
		
		//Test mit 3 Challenges der verschiedenen Typen			
			//1. Kartei (typ 1 --> Checkbox)
			antworten[0] = "10 Jahre";
			antworten[1] = "30 Jahre";
			antworten[2] = "50 Jahre";
			antworten[3] = "70 Jahre";
			antworten[4] = "90 Jahre";
			antworten[5] = "110 Jahre";
			korrekteAntworten[0] = 4;
			zeitstempel.setTime(0);
			challenge = new Challenge(category, 1, zeitstempel, "Wie hoch ist die maximale Lebenserwartung von Blauwalen", 1, antworten, korrekteAntworten);
			alleChallenges.add(challenge);
			//2. Kartei (typ 2 --> text-eingabe)
			antworten[0] = "33";
			korrekteAntworten = null;
			zeitstempel.setTime(0);
			challenge = new Challenge(category, 2, zeitstempel, "Wie viele Meter wird ein Blauwal maximal", 1, antworten, korrekteAntworten);
			alleChallenges.add(challenge);
			
			//2. Kartei (typ 2 --> text-eingabe)
			antworten[0] = "33";
			korrekteAntworten = null;
			zeitstempel.setTime(0);
			challenge = new Challenge(category, 2, zeitstempel, "Wie viele Meter wird ein Blauwal maximal", 1, antworten, korrekteAntworten);
			alleChallenges.add(challenge);
			
			//3. Kartei (typ 3 --> Selbstkontrolle)
			antworten[0] = "200";
			korrekteAntworten = null;
			zeitstempel.setTime(0);
			challenge = new Challenge(category, 2, zeitstempel, "Wie viele Tonnen wiegt ein Blauwal maximal", 1, antworten, korrekteAntworten);
			alleChallenges.add(challenge);
			
			
		return alleChallenges;
	}
}