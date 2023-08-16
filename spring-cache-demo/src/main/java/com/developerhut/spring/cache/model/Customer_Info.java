package com.developerhut.spring.cache.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer_info")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer_Info {

	@Id
	private Integer customer_number;

	private String name;

	private String gender;

	private String course;

}
