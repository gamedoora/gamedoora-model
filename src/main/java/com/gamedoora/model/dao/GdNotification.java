package com.gamedoora.model.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "notifications")
public class GdNotification implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "notifications", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "uid", table = "notifications")
    private String uid;
    @Basic(optional = false)
    @Column(name = "entity_type", table = "notifications", nullable = false)
    private String entityType;
    @Basic(optional = false)
    @Column(name = "entity_id", table = "notifications", nullable = false)
    private int entityId;
    @Lob
    @Basic
    @Column(name = "context", table = "notifications", length = 65535)
    private String context;
    @Basic
    @Column(name = "action_url", table = "notifications")
    private String actionUrl;
    @Basic
    @Column(name = "is_email", table = "notifications")
    private Short isEmail;
    @Basic
    @Column(name = "is_notification", table = "notifications")
    private Short isNotification;
    @Basic(optional = false)
    @Column(name = "created_at", table = "notifications", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "notifications", nullable = false)
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

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public Short getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(Short isEmail) {
        this.isEmail = isEmail;
    }

    public Short getIsNotification() {
        return isNotification;
    }

    public void setIsNotification(Short isNotification) {
        this.isNotification = isNotification;
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