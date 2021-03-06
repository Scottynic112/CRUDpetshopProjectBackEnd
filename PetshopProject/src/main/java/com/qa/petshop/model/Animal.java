package com.qa.petshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
    public String givenName;
    public String commonName;
    public String type;
    public int price;
    public String sex;
    public String colour;
    public String arrival;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    public Animal() {
    }
    
    public Animal(String givenName, String commonName, String type, int price, String sex, String colour, String arrival) {
        this.givenName = givenName;
        this.commonName = commonName;
        this.type = type;
        this.price = price;
        this.sex = sex;
        this.colour = colour;
        this.arrival = arrival;

    }

	public Animal(String[] info) {
        this();
    }

	public String getArrival() {
        return arrival;
    }

    public String getColour() {
        return colour;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getGivenName() {
        return givenName;
    }

    public Long getId() {
		return Id;
	}

    public int getPrice() {
        return price;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }

    public void setArrival(String input) {
        this.arrival = input;
    }

    public void setColour(String input) {
        this.colour = input;
    }

    public void setCommonName(String input) {
        this.commonName = input;
    }

    public void setGivenName(String input) {
        this.givenName = input;
    }

    public void setId(Long id) {
		Id = id;
	}

    public void setPrice(int input) {
        this.price = input;
    }

    public void setSex(String input) {
        this.sex = input;
    }

    public void setType(String input) {
        this.type = input;
    }
    

		
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrival == null) ? 0 : arrival.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((commonName == null) ? 0 : commonName.hashCode());
		result = prime * result + ((givenName == null) ? 0 : givenName.hashCode());
		result = prime * result + price;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (arrival == null) {
			if (other.arrival != null)
				return false;
		} else if (!arrival.equals(other.arrival))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (commonName == null) {
			if (other.commonName != null)
				return false;
		} else if (!commonName.equals(other.commonName))
			return false;
		if (givenName == null) {
			if (other.givenName != null)
				return false;
		} else if (!givenName.equals(other.givenName))
			return false;
		if (price != other.price)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
