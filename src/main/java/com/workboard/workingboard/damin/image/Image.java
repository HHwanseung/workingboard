package com.workboard.workingboard.damin.image;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.workboard.workingboard.damin.user.user.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    private String caption;

    private String postImage;


    @ManyToOne
    @JsonIgnoreProperties({"password", "images"})
    private User user;


}
