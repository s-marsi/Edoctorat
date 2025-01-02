package com.openclassrooms.edoctorat.repositories;

import com.openclassrooms.edoctorat.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
