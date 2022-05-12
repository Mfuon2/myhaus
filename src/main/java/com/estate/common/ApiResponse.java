package com.estate.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private T data;
    private boolean success;
    private String message;

    public ApiResponse(boolean status, String message) {
        this.data = null;
        this.message = message;
        this.success = status;
    }
}
