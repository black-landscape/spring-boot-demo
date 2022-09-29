package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "User")
@ApiModel(description = "用户实体")
public class User {

    @Id
    @GeneratedValue
    @JacksonXmlProperty(localName = "id")
    @ApiModelProperty(value = "用户编号", position = 1)
    private Long id;

    @NotNull
    @Size(min = 2, max = 5)
    @JacksonXmlProperty(localName = "name")
    @ApiModelProperty(value = "用户姓名", position = 2)
    private String name;

    @NotNull
    @Max(100)
    @Min(10)
    @JacksonXmlProperty(localName = "age")
    @ApiModelProperty(value = "用户年龄", position = 3)
    private Integer age;

//    @NotNull
//    @Email
//    @JacksonXmlProperty(localName = "email")
//    @ApiModelProperty(value = "用户邮箱", position = 4)
//    private String email;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
