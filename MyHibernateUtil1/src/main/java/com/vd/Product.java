package com.vd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "products")
	public class Product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	     
	    @Column(length = 64, nullable = false, unique = true)
	    private String name;
	     
	    private float price;
	 
	    public Product() {
	    }  
	 
	    public Product(String name, float price) {
	        this(null, name, price);
	    }
	 
	    public Product(Integer id) {
	        this.id = id;
	    }
	     
	    public Product(Integer id, String name, float price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
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

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}


}
