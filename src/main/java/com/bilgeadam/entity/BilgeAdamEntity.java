package com.bilgeadam.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "bilge_adam")

public class BilgeAdamEntity implements Serializable {
	private static final long serialVersionUID = 2832881670481166004L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Mysql
	private long id;
	// isim:
	@Column(name = "name", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", updatable = false)
	private String password;
	
	@Column(name = "specific", insertable = false)
	private String specific;
	
	@Column(name = "price", length = 10, nullable = false)
	private double price;
	// blob:büyük verilerimizi database gömmek isteyebiliriz.
	// bütün veriler database olsun
	// büyük veriler ile uğraşmak
	
	@Lob // sıkıştırma yapıyor
	
	private String bigData;
	
	@Lob
	
	private String Html;
	
	@Lob
	
	private String Css;
	
	@Lob
	
	private String picture;
	
	public String getHtml() {
		return Html;
	}
	
	public void setHtml(String html) {
		Html = html;
	}
	
	public String getCss() {
		return Css;
	}
	
	public void setCss(String css) {
		Css = css;
	}
	
	public String getSpecific() {
		return specific;
	}
	
	public void setSpecific(String specific) {
		this.specific = specific;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getBigData() {
		return bigData;
	}
	
	public void setBigData(String bigData) {
		this.bigData = bigData;
	}
	
}
