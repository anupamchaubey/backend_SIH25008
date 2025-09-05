package com.project.sih25008.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "submissions")
public class Submission {
    @Id
    private String id;
    private String projectId;
    private String submittedBy; // User ID
    private String fileUrl;
}
