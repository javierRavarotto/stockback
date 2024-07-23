package com.stock.entitys;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Clothes{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	private Integer  code;
	private String name;
	private String color;
	private int price;
	private String category;
	private String model;
	private String type;
	private String image;
	private Boolean high;
	private Date creationDate;
	private Date editDate;	
	private List<String> sizes;
	private Date lowDate;
	
	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Clothes(Integer id, Integer code, String name, String color, int price, String category, String model,
			String type, String image, Boolean high, Date creationDate, Date editDate, List<String> sizes,
			Date lowDate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.color = color;
		this.price = price;
		this.category = category;
		this.model = model;
		this.type = type;
		this.image = image;
		this.high = high;
		this.creationDate = creationDate;
		this.editDate = editDate;
		this.sizes = sizes;
		this.lowDate = lowDate;
	}
	 

	@Override
	public String toString() {
		return "Clothes [id=" + id + ", code=" + code + ", name=" + name + ", color=" + color + ", price=" + price
				+ ", category=" + category + ", model=" + model + ", type=" + type + ", image=" + image + ", high="
				+ high + ", creationDate=" + creationDate + ", editDate=" + editDate + ", sizes=" + sizes + ", lowDate="
				+ lowDate + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getHigh() {
		return high;
	}

	public void setHigh(Boolean high) {
		this.high = high;
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

	public List<String> getSizes() {
		return sizes;
	}

	public void setSizes(List<String> sizes) {
		this.sizes = sizes;
	}

	public Date getLowDate() {
		return lowDate;
	}

	public void setLowDate(Date lowDate) {
		this.lowDate = lowDate;
	}	
	
}