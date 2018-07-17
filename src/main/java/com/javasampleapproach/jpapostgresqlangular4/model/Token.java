package com.javasampleapproach.jpapostgresqlangular4.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "token")
public class Token implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tokenId;

	@Column(name = "issuingZone")
	private String issuingZone;

	@Column(name = "issuingStation")
	private String issuingStation;

	protected Token() {
	}

	public long getTokenId() {
		return tokenId;
	}

	public void setTokenId(long tokenId) {
		this.tokenId = tokenId;
	}

	public String getIssuingZone() {
		return issuingZone;
	}

	public void setIssuingZone(String issuingZone) {
		this.issuingZone = issuingZone;
	}

	public String getIssuingStation() {
		return issuingStation;
	}

	public void setIssuingStation(String issuingStation) {
		this.issuingStation = issuingStation;
	}

	@Override
	public String toString() {
		return "Token [tokenId=" + tokenId + ", issuingZone=" + issuingZone + ", issuingStation=" + issuingStation
				+ "]";
	}

	public Token(Long tokenId,String issuingZone, String issuingStation) {
		
		this.tokenId=tokenId;
		this.issuingZone = issuingZone;
		this.issuingStation = issuingStation;
	}

	
	
}
