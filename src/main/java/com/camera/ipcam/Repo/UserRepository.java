package com.camera.ipcam.Repo;

import com.camera.ipcam.model.UserModel;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByUsername(String Username);
}
