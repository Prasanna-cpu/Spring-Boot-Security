package com.Spring.SpringSecurity.Service;

import com.Spring.SpringSecurity.Entity.User;
import com.Spring.SpringSecurity.Model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
