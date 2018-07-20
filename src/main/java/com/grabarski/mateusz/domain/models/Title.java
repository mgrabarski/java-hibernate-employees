package com.grabarski.mateusz.domain.models;

import com.grabarski.mateusz.domain.models.keys.TitlePrimaryKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Mateusz Grabarski on 20.07.2018.
 */
@Entity
@Table(name = "titles")
public class Title {

    @EmbeddedId
    private TitlePrimaryKey id;

    @Column(name = "to_date")
    private Date toDate;

    public TitlePrimaryKey getId() {
        return id;
    }

    public void setId(TitlePrimaryKey id) {
        this.id = id;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}