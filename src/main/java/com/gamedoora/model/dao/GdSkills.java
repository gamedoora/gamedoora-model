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
@Table(schema = "skills")
public class GdSkills {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	@Column(name = "skill_name", nullable = false)
	private String skillName;

	@Basic
	@Column(name = "skill_description", nullable = false)
	private String skillDescription;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "skills_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<GdRole> roles = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public Set<GdRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<GdRole> roles) {
		this.roles = roles;
	}

}
