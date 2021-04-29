package com.example.springbootdemo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String password;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "users_courses",
            joinColumns = {
                    @JoinColumn(
                            name = "uid",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "cid",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Course> courses;


//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    @OneToOne
//    @JoinColumn(name = "country_id")
//    private Country country;
}
