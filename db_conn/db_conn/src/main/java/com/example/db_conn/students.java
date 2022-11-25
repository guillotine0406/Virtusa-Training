package com.example.db_conn;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class students {
	@Column
	private int REG_NO;
    @Column
	private String NAME;
    @Column
    private String DEPT;
    
    public students() {
    	
    }
    
	public students(int rEG_NO, String nAME, String dEPT) {
		super();
		REG_NO = rEG_NO;
		NAME = nAME;
		DEPT = dEPT;
	}

	public int getREG_NO() {
		return REG_NO;
	}

	public void setREG_NO(int rEG_NO) {
		REG_NO = rEG_NO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDEPT() {
		return DEPT;
	}

	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
}
