package com.ems;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eid;
	String enm;
	int esal;
	public Employee() {
		super();
	
	}
	public Employee(int eid, String enm, int esal) {
		super();
		this.eid = eid;
		this.enm = enm;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnm() {
		return enm;
	}
	public void setEnm(String enm) {
		this.enm = enm;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Class [eid=" + eid + ", enm=" + enm + ", esal=" + esal + "]";
	}
	
	

}
