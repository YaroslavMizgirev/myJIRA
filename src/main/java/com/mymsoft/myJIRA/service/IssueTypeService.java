package com.mymsoft.myJIRA.service;

import com.mymsoft.myJIRA.dto.IssueTypeDto;
import com.mymsoft.myJIRA.model.IssueType;

import java.util.List;
import java.util.Optional;

public interface IssueTypeService {
    List<IssueTypeDto> getAllIssueTypes();
    Optional<IssueTypeDto> getIssueTypeById(Long id);
    Optional<IssueTypeDto> getIssueTypeByName(String name);
    IssueType createIssueType(IssueTypeDto issueTypeDto);
    IssueType updateIssueType(Long id, IssueTypeDto issueTypeDto);
    void deleteIssueType(Long id);
}
