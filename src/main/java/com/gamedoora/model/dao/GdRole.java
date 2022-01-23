package com.gamedoora.model.dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajsh
 */

@Entity
@Table(name = "role")
public class GdRole implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	@Basic
	@Column(name = "role_name")
	private String name;
	@Basic
	@Column(name = "role_description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}