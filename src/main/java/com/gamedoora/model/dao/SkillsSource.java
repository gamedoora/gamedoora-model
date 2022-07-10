package com.gamedoora.model.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills_sources")
public class SkillsSource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "skill_id")
	Skills skills;

	@ManyToOne
	@JoinColumn(name = "source_id")
	Sources sources;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public Sources getSources() {
		return sources;
	}

	public void setSources(Sources sources) {
		this.sources = sources;
	}

}
