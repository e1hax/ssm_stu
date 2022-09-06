package com.mbp.domain;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by e1hax on 2022-09-05.
 */
@Setter
@Getter
@ToString
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

}
