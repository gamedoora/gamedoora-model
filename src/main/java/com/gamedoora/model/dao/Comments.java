package com.gamedoora.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Builder
@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name = "comments")
public class Comments extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "context" , nullable = false)
    private String context;

    @Column(name = "commentable_id" , nullable = false)
    private long commentableId;

    @Column(name = "commentable_type" , nullable = false)
    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;

    @Column(name = "parent_id")
    private long parentId;
}