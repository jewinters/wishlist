package com.winters.wishlist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Person owner;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "purchaser_id", nullable = true)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Person purchaser;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Person purchaser) {
        this.purchaser = purchaser;
    }
}
