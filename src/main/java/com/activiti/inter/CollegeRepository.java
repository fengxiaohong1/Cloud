package com.activiti.inter;

import com.activiti.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author fxh
 */
@RepositoryRestResource(path="college")
public interface CollegeRepository  extends JpaRepository<College,Long> {
    College  findByNameStartsWith(String name);
}
