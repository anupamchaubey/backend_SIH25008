package com.project.sih25008.service;

import com.project.sih25008.model.Submission;
import com.project.sih25008.repository.SubmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubmissionService {
    private final SubmissionRepository submissionRepository;

    public Submission createSubmission(Submission submission) {
        return submissionRepository.save(submission);
    }

    public List<Submission> getSubmissionsByProject(String projectId) {
        return submissionRepository.findByProjectId(projectId);
    }
}
