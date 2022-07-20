package hxh.qt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String name;
	private String description;
	private float price;
	@Column(name="in_stock")
	private Integer inStock;
	@Column(name="max_in_stock")
	private Integer maxInStock;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getInStock() {
		return inStock;
	}
	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}
	public Integer getMaxInStock() {
		return maxInStock;
	}
	public void setMaxInStock(Integer maxInStock) {
		this.maxInStock = maxInStock;
	}
	
}
