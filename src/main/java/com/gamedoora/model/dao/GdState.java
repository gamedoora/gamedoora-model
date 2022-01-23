package com.gamedoora.model.dao;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "states", uniqueConstraints = @UniqueConstraint(columnNames = {"studio_id", "created_at", "name"}))
public class GdState {

    @Id
    @GeneratedValue
    @Column(name = "id", table = "states", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", table = "states")
    private String name;
    @Basic(optional = false)
    @Column(name = "studio_id", table = "states", nullable = false)
    private int studioId;
    @Basic(optional = false)
    @Column(name = "position", table = "states", nullable = false)
    private int position;
    @Basic(optional = false)
    @Column(name = "created_at", table = "states", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at", table = "states", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudioId() {
        return studioId;
    }

    public void setStudioId(int studioId) {
        this.studioId = studioId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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