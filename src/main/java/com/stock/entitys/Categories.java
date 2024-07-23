package com.stock.entitys;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Categories{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	private String name;
	@OneToOne
	private Colors color;
	private Date creationDate;
	private Date editDate;	
	private Date lowDate;
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categories(Integer id, String name, Colors color, Date creationDate, Date editDate, Date lowDate) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.creationDate = creationDate;
		this.editDate = editDate;
		this.lowDate = lowDate;
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
	
	
	
	public Colors getColor() {
		return color;
	}
	public void setColor(Colors color) {
		this.color = color;
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

	@Override
	public String toString() {
		return "Categories [id=" + id + ", name=" + name + ", color=" + color + ", creationDate=" + creationDate
				+ ", editDate=" + editDate + ", lowDate=" + lowDate + "]";
	}
	
	
	
	
	
}
