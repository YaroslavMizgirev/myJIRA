package com.mymsoft.myJIRA.repository;

import com.mymsoft.myJIRA.dto.IssueTypeDto;
import com.mymsoft.myJIRA.model.IssueType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IssueTypeRepository extends JpaRepository<Long, IssueTypeDto> {
    Optional<IssueTypeDto> findByName(String name);
}
