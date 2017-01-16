package com.wisely.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xiedan11 on 2017/1/13.
 */
@Component
@ConfigurationProperties(prefix = "author", locations = "classpath:author.properties")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
