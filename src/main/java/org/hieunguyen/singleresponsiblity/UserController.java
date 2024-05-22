package org.hieunguyen.singleresponsiblity;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private IUserPersistence userPersistence;
    private IUserValidation userValidation;

    public UserController(IUserPersistence userPersistence, IUserValidation userValidation) {
        this.userPersistence = userPersistence;
        this.userValidation = userValidation;
    }

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        if (!userValidation.validate(user)) {
            return "ERROR";
        }

        return userPersistence.store(user) ? "SUCCESS" : "ERROR";
    }

}