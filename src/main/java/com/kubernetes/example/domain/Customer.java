package com.kubernetes.example.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer implements Comparable<Customer>{

	private Integer age;
	private Integer id;
	private String email;
	private Integer salary;
	
	@Override
	public int compareTo(Customer o) {
		if(this.age == o.age) {
			return 0;
		} 
		return this.age > o.age ? 1 : -1;
	}

}
