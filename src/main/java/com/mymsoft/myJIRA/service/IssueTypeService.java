package com.mymsoft.myJIRA.service;

import com.mymsoft.myJIRA.dto.IssueTypeCreateDto;
import com.mymsoft.myJIRA.model.IssueType;

public interface IssueTypeService {
    IssueType createIssueType(IssueTypeCreateDto issueTypeCreateDto);
    IssueType updateIssueType(Long id, IssueTypeCreateDto issueTypeCreateDto);
    void deleteIssueType(Long id);
}
