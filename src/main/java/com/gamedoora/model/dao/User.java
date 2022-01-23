package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id", table = "users", nullable = false)
	private Long id;

	@Basic(optional = false)
	@Column(name = "email", table = "users", nullable = false)
	private String email;

	@Basic(optional = false)
	@Column(name = "encrypted_password", table = "users", nullable = false)
	private String encryptedPassword;

	@Basic
	@Column(name = "reset_password_token", table = "users")
	private String resetPasswordToken;

	@Basic
	@Column(name = "reset_password_sent_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resetPasswordSentAt;

	@Basic
	@Column(name = "remember_created_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rememberCreatedAt;
	@Basic(optional = false)
	@Column(name = "sign_in_count", table = "users", nullable = false)
	private int signInCount;

	@Basic
	@Column(name = "current_sign_in_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date currentSignInAt;

	@Basic
	@Column(name = "last_sign_in_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSignInAt;
	@Basic
	@Column(name = "current_sign_in_ip", table = "users")
	private String currentSignInIp;

	@Basic
	@Column(name = "last_sign_in_ip", table = "users")
	private String lastSignInIp;

	@Basic(optional = false)
	@Column(name = "created_at", table = "users", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Basic(optional = false)
	@Column(name = "updated_at", table = "users", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	@Basic
	@Column(name = "provider", table = "users")
	private String provider;

	@Basic
	@Column(name = "uid", table = "users")
	private String uid;

	@Basic
	@Column(name = "name", table = "users")
	private String name;

	@Basic
	@Column(name = "confirmation_token", table = "users")
	private String confirmationToken;

	@Basic
	@Column(name = "confirmed_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date confirmedAt;

	@Basic
	@Column(name = "confirmation_sent_at", table = "users")
	@Temporal(TemporalType.TIMESTAMP)
	private Date confirmationSentAt;

	@Basic
	@Column(name = "unconfirmed_email", table = "users")
	private String unconfirmedEmail;
	@OneToMany
	private List<GdStoryUser> storyUsers;

	@OneToMany
	private List<GdStudioUserRequest> studioUserRequests;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "users_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<GdRole> roles = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public Date getResetPasswordSentAt() {
		return resetPasswordSentAt;
	}

	public void setResetPasswordSentAt(Date resetPasswordSentAt) {
		this.resetPasswordSentAt = resetPasswordSentAt;
	}

	public Date getRememberCreatedAt() {
		return rememberCreatedAt;
	}

	public void setRememberCreatedAt(Date rememberCreatedAt) {
		this.rememberCreatedAt = rememberCreatedAt;
	}

	public int getSignInCount() {
		return signInCount;
	}

	public void setSignInCount(int signInCount) {
		this.signInCount = signInCount;
	}

	public Date getCurrentSignInAt() {
		return currentSignInAt;
	}

	public void setCurrentSignInAt(Date currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public Date getLastSignInAt() {
		return lastSignInAt;
	}

	public void setLastSignInAt(Date lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getCurrentSignInIp() {
		return currentSignInIp;
	}

	public void setCurrentSignInIp(String currentSignInIp) {
		this.currentSignInIp = currentSignInIp;
	}

	public String getLastSignInIp() {
		return lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public Date getConfirmedAt() {
		return confirmedAt;
	}

	public void setConfirmedAt(Date confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public Date getConfirmationSentAt() {
		return confirmationSentAt;
	}

	public void setConfirmationSentAt(Date confirmationSentAt) {
		this.confirmationSentAt = confirmationSentAt;
	}

	public String getUnconfirmedEmail() {
		return unconfirmedEmail;
	}

	public void setUnconfirmedEmail(String unconfirmedEmail) {
		this.unconfirmedEmail = unconfirmedEmail;
	}

	public List<GdStoryUser> getStoryUsers() {
		if (storyUsers == null) {
			storyUsers = new ArrayList<>();
		}
		return storyUsers;
	}

	public void setStoryUsers(List<GdStoryUser> storyUsers) {
		this.storyUsers = storyUsers;
	}

	public void addStoryUser(GdStoryUser storyUser) {
		getStoryUsers().add(storyUser);
	}

	public void removeStoryUser(GdStoryUser storyUser) {
		getStoryUsers().remove(storyUser);
	}

	public List<GdStudioUserRequest> getStudioUserRequests() {
		if (studioUserRequests == null) {
			studioUserRequests = new ArrayList<>();
		}
		return studioUserRequests;
	}

	public void setStudioUserRequests(List<GdStudioUserRequest> studioUserRequests) {
		this.studioUserRequests = studioUserRequests;
	}

	public void addStudioUserRequest(GdStudioUserRequest studioUserRequest) {
		getStudioUserRequests().add(studioUserRequest);
	}

	public void removeStudioUserRequest(GdStudioUserRequest studioUserRequest) {
		getStudioUserRequests().remove(studioUserRequest);
	}
	
	public Set<GdRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<GdRole> roles) {
		this.roles = roles;
	}

}