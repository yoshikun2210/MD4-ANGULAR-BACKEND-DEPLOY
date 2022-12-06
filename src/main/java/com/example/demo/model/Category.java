package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "category",uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "nameCategory"
        })
})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCategory;
    private String avatarCategory;
    @ManyToOne
    User user;

    public Category() {
    }

    public Category(Long id, String nameCategory, String avatarCategory, User user) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.avatarCategory = avatarCategory;
        this.user = user;
    }
}
