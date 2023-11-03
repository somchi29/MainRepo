package org.chisom.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatCreationRequest {
    private String message;
    private Boolean seen = false;
    private LocalDateTime createdTime;
}
