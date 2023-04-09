package com.example.Waffle.repository;

import com.example.Waffle.entity.UserGroup.UserGroupEntity;
import com.example.Waffle.entity.UserGroup.UserGroupPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroupEntity, UserGroupPK> {

    List<UserGroupEntity> findByUserId(Long userId);
}
