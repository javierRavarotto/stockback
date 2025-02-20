package com.stock.entitys;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Local{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	private String name;
	@OneToMany
	private List<Clothes>stock;
	private List<String>message;
	private Date creationDate;
	private Date editDate;	
	private Date lowDate;
	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Local(Integer id, String name, List<Clothes> stock, List<String> message, Date creationDate, Date editDate,
			Date lowDate) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.message = message;
		this.creationDate = creationDate;
		this.editDate = editDate;
		this.lowDate = lowDate;
	}
	@Override
	public String toString() {
		return "Local [id=" + id + ", name=" + name + ", stock=" + stock + ", message=" + message + ", creationDate="
				+ creationDate + ", editDate=" + editDate + ", lowDate=" + lowDate + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Clothes> getStock() {
		return stock;
	}
	public void setStock(List<Clothes> stock) {
		this.stock = stock;
	}
	public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
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
	
	
}