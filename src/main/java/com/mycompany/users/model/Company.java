package com.mycompany.users.model;

import java.io.Serializable;
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
public class Company implements Serializable {

	private String Name;
	private Set<Employee> employees = new HashSet<Employee>(0);
        private Set<Project> projects = new HashSet<Project>();

	public Company() {
	}

	@Id
	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.Name;
	}

	public void setName(String username) {
		this.Name = username;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

    /**
     * @return the projects
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")    
    public Set<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

}
