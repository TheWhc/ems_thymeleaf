package com.whc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: Emp
 * @Author: whc
 * @Date: 2021/05/15/18:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	private String id;
	private String name;
	private Double salary;
	private Integer age;
	private Date bir;
}
