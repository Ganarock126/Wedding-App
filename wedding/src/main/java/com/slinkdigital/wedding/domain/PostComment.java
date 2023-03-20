package com.slinkdigital.wedding.domain;

import java.io.Serializable;
import java.time.Instant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author TEGA
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostComment implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Post post;
    
    @Lob
    private String message;
    
    @Column(nullable = false)
    private Instant createdAt;    
}
