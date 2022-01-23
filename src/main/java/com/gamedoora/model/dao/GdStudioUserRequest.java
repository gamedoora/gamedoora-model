package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "studio_user_requests")
public class GdStudioUserRequest implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "studio_user_requests", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "uid", table = "studio_user_requests")
    private String uid;
    @Basic(optional = false)
    @Column(name = "studio_id", table = "studio_user_requests", nullable = false)
    private int studioId;
    @Basic(optional = false)
    @Column(name = "user_id", table = "studio_user_requests", nullable = false)
    private int userId;
    @Basic(optional = false)
    @Column(name = "status", table = "studio_user_requests", nullable = false)
    private String status;
    @Basic
    @Column(name = "updated_by", table = "studio_user_requests")
    private Integer updatedBy;
    @Basic(optional = false)
    @Column(name = "created_at", table = "studio_user_requests", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "studio_user_requests", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getStudioId() {
        return studioId;
    }

    public void setStudioId(int studioId) {
        this.studioId = studioId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
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

}