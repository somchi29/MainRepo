package org.chisom.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequest {
    private String userName;
    private String email;
    private String password;
}
