package com.mymsoft.myJIRA.service;

import com.mymsoft.myJIRA.dto.IssueTypeCreateDto;
import com.mymsoft.myJIRA.model.IssueType;
import com.mymsoft.myJIRA.repository.IssueTypeRepository;

public class IssueTypeServiceImpl implements IssueTypeService {
    private final IssueTypeRepository issueTypeRepository;

    public IssueTypeServiceImpl(IssueTypeRepository issueTypeRepository) {
        this.issueTypeRepository = issueTypeRepository;
    }

    @Override
    public IssueType createIssueType(IssueTypeCreateDto issueTypeCreateDto) {
        IssueType issueType = new IssueType();
        issueType.setName(issueTypeCreateDto.getName());
        issueType.setIconUrl(issueTypeCreateDto.getIconUrl());
        issueType.setColorHexCode(issueTypeCreateDto.getColorHexCode());
        return issueTypeRepository.save(issueType);
    }

    @Override
    public IssueType updateIssueType(Long id, IssueTypeCreateDto issueTypeCreateDto) {
        return null;
    }

    @Override
    public void deleteIssueType(Long id) {

    }
}
