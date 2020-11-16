package com.cosmin.minuapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tab1", schema = "minuappdb")
@EntityListeners(AuditingEntityListener.class)
public class Tab1 implements Serializable {

    @Id
    @Column
    private UUID id;

    @Column
    private String description;

    @PrePersist
    public void prePersist() {
        this.id = this.id != null ? this.id:UUID.randomUUID();
    }

}
