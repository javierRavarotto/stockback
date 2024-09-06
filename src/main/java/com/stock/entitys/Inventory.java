package com.stock.entitys;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Inventory {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	@ManyToOne
	@JoinColumn(name="stock_id")
	private Stock stock;
	@ManyToOne
	@JoinColumn(name="clothe_id")
	private Clothes clothe;
	private Integer s;
	private Integer m;
	private Integer l;
	private Integer xl;
	private Integer doublexl;
	private Integer triplexl;
	private Integer fourxl;
	private Integer mg;
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Clothes getClothe() {
		return clothe;
	}
	public void setClothe(Clothes clothe) {
		this.clothe = clothe;
	}
	public Integer getS() {
		return s;
	}
	public void setS(Integer s) {
		this.s = s;
	}
	public Integer getM() {
		return m;
	}
	public void setM(Integer m) {
		this.m = m;
	}
	public Integer getL() {
		return l;
	}
	public void setL(Integer l) {
		this.l = l;
	}
	public Integer getXl() {
		return xl;
	}
	public void setXl(Integer xl) {
		this.xl = xl;
	}
	public Integer getDoublexl() {
		return doublexl;
	}
	public void setDoublexl(Integer doublexl) {
		this.doublexl = doublexl;
	}
	public Integer getTriplexl() {
		return triplexl;
	}
	public void setTriplexl(Integer triplexl) {
		this.triplexl = triplexl;
	}
	public Integer getFourxl() {
		return fourxl;
	}
	public void setFourxl(Integer fourxl) {
		this.fourxl = fourxl;
	}
	public Integer getMg() {
		return mg;
	}
	public void setMg(Integer mg) {
		this.mg = mg;
	}	
	
}
