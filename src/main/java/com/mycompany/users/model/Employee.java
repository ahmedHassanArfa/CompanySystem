package com.mycompany.users.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	private String Name;

        private Company company;
        
	public Employee() {
	}

	public Employee(String username, String password, boolean enabled) {
		this.Name = username;
	}

	public Employee(String username, String password, boolean enabled, Set<UserRole> userRole) {
		this.Name = username;
	}

	@Id
	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getUsername() {
		return this.Name;
	}

	public void setUsername(String username) {
		this.Name = username;
	}

        @ManyToOne
        public Company getCompany() {
            return company;
        }

        public void setCompany(Company company) {
            this.company = company;
        }

}
