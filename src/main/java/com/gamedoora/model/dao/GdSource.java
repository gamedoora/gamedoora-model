package com.gamedoora.model.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "source")
public class GdSource {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	@Column(name = "source_name", nullable = false)
	private String sourceName;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "source_skills", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "source_id"))
	private Set<GdSkills> skills = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Set<GdSkills> getSkills() {
		return skills;
	}

	public void setSkills(Set<GdSkills> skills) {
		this.skills = skills;
	}

}
