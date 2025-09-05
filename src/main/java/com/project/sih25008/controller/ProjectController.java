package com.project.sih25008.controller;

import com.project.sih25008.dto.CreateProjectDto;
import com.project.sih25008.model.Project;
import com.project.sih25008.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping
    public Project createProject(@RequestBody CreateProjectDto dto, Principal principal) {
        Project project = Project.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .ownerId(principal.getName())
                .build();
        return projectService.createProject(project);
    }

    @GetMapping("/my")
    public List<Project> getMyProjects(Principal principal) {
        return projectService.getProjectsByOwner(principal.getName());
    }
}
