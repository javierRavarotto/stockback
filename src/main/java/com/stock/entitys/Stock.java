package com.stock.entitys;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Stock {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	private Date creationDate;
	private Date editDate;	
	private Date lowDate;
	@OneToOne
	private Local local;
	@OneToMany(mappedBy = "stock")
	@JsonIgnore
	private List<Inventory> inventory;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	public Date getLowDate() {
		return lowDate;
	}
	public void setLowDate(Date lowDate) {
		this.lowDate = lowDate;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public List<Inventory> getInventory() {
		return inventory;
	}
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	
		
}
