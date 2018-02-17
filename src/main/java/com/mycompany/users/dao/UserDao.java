package com.mycompany.users.dao;

import com.mycompany.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}