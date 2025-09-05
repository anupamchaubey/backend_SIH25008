package com.project.sih25008.controller;

import com.project.sih25008.model.Submission;
import com.project.sih25008.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/submissions")
@RequiredArgsConstructor
public class SubmissionController {
    private final SubmissionService submissionService;

    @PostMapping
    public Submission createSubmission(@RequestBody Submission submission, Principal principal) {
        submission.setSubmittedBy(principal.getName());
        return submissionService.createSubmission(submission);
    }

    @GetMapping("/project/{projectId}")
    public List<Submission> getSubmissionsByProject(@PathVariable String projectId) {
        return submissionService.getSubmissionsByProject(projectId);
    }
}
