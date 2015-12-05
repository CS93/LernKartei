package de.fhdw.bfws114a.data;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Challenge implements Serializable {
	private String mKartei;
	private int FileID;
	private int CardID;
	private int mAktuelleKlasse;
	private Date mZeitstempel;
	private String mFrage;
	private int mFrageTyp; //1 = Checkbox; 2 = Text; 3 = Eigenkontrolle
	private String[] mAntworten; //Fragetyp 1 = 6 Anworten; 2 = nur die korrekte Antwort; 3 = nur die Korrekte Antwort
	private boolean[] mKorrekteAnwortenFuerCheckbox; //Fragetyp 1 = zu den 6 mAntworten jeweils ein Indiz ob diese Antwort richtig (true) ist; sonst = leer
	
	
	public Challenge(String kartei, int cardID, int fileID, int aktuelleKlasse, Date zeitstempel, String frage, int frageTyp,
			String[] antworten, boolean[] korrekteAnwortenFuerCheckbox) {
		super();
		this.mKartei = kartei;
		this.mAktuelleKlasse = aktuelleKlasse;
		this.mZeitstempel = zeitstempel;
		this.mFrage = frage;
		this.mFrageTyp = frageTyp;
		this.mAntworten = antworten;
		this.mKorrekteAnwortenFuerCheckbox = korrekteAnwortenFuerCheckbox;
	}
	
	
	public String getKartei() {
		return mKartei;
	}
	public void setKartei(String mKartei) {
		this.mKartei = mKartei;
	}
	public int getFileID() {
		return FileID;
	}


	public void setFileID(int fileID) {
		FileID = fileID;
	}


	public int getCardID() {
		return CardID;
	}


	public void setCardID(int cardID) {
		CardID = cardID;
	}


	public int getAktuelleKlasse() {
		return mAktuelleKlasse;
	}
	public void setAktuelleKlasse(int mAktuelleKlasse) {
		this.mAktuelleKlasse = mAktuelleKlasse;
	}
	public Date getZeitstempel() {
		return mZeitstempel;
	}
	public void setZeitstempel(Date mZeitstempel) {
		this.mZeitstempel = mZeitstempel;
	}
	public String getFrage() {
		return mFrage;
	}
	public void setFrage(String mFrage) {
		this.mFrage = mFrage;
	}
	public int getFrageTyp() {
		return mFrageTyp;
	}
	public void setFrageTyp(int mFrageTyp) {
		this.mFrageTyp = mFrageTyp;
	}
	public String[] getAntworten() {
		return mAntworten;
	}
	public String getAntwort(int index) {
		return mAntworten[index];
	}
	public void setAntworten(String[] mAntworten) {
		this.mAntworten = mAntworten;
	}
	public boolean[] getKorrekteAnwortenFuerCheckbox() {
		return mKorrekteAnwortenFuerCheckbox;
	}
	public void setKorrekteAnwortenFuerCheckbox(boolean[] mKorrekteAnwortenFuerCheckbox) {
		this.mKorrekteAnwortenFuerCheckbox = mKorrekteAnwortenFuerCheckbox;
	}
	
	
	}
