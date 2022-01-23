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
@Table(name = "notification_users")
public class GdNotificationUser implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "notification_users", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "notification_id", table = "notification_users", nullable = false)
    private int notificationId;
    @Basic(optional = false)
    @Column(name = "user_id", table = "notification_users", nullable = false)
    private int userId;
    @Basic
    @Column(name = "is_seen", table = "notification_users")
    private Short isSeen;
    @Basic
    @Column(name = "is_clicked", table = "notification_users")
    private Short isClicked;
    @Basic(optional = false)
    @Column(name = "created_at", table = "notification_users", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "notification_users", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Short getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(Short isSeen) {
        this.isSeen = isSeen;
    }

    public Short getIsClicked() {
        return isClicked;
    }

    public void setIsClicked(Short isClicked) {
        this.isClicked = isClicked;
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