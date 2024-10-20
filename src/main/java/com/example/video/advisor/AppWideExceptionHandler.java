package com.example.video.advisor;

import com.example.video.exception.NotFoundException;
import com.example.video.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppWideExceptionHandler
{
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFounException(NotFoundException e)
    {
        return new ResponseEntity(new StandardResponse(404, "Error", e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
