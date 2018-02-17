package com.mycompany.users.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Project {

	private String Name;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);

	public Project() {
	}

	public Project(String username, String password, boolean enabled) {
		this.Name = username;
	}

	public Project(String username, String password, boolean enabled, Set<UserRole> userRole) {
		this.Name = username;
		this.userRole = userRole;
	}

	@Id
	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getUsername() {
		return this.Name;
	}

	public void setUsername(String username) {
		this.Name = username;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRole() {
		return this.userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}
