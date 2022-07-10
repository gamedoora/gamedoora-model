package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sources")
public class Sources extends Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "source_name")
	private String name;

	@OneToMany(mappedBy = "sources")
	Set<SkillsSource> skillsSources;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SkillsSource> getSkillsSources() {
		return skillsSources;
	}

	public void setSkillsSources(Set<SkillsSource> skillsSources) {
		this.skillsSources = skillsSources;
	}

}
