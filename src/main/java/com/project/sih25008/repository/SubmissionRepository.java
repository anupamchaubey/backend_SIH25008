package com.project.sih25008.repository;

import com.project.sih25008.model.Submission;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubmissionRepository extends MongoRepository<Submission, String> {
    List<Submission> findByProjectId(String projectId);
}
