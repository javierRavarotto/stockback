package com.stock.entitys;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Colors{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	private String name;
	private String code;
	private Date creationDate;
	private Date editDate;	
	private Date lowDate;
	public Colors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colors(Integer id, String name, String code, Date creationDate, Date editDate, Date lowDate) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.creationDate = creationDate;
		this.editDate = editDate;
		this.lowDate = lowDate;
	}
	@Override
	public String toString() {
		return "Colors [id=" + id + ", name=" + name + ", code=" + code + ", creationDate=" + creationDate
				+ ", editDate=" + editDate + ", lowDate=" + lowDate + "]";
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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