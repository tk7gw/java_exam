package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Integer id) {
        User user = userService.findById(id);

        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail());
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public List<UserResponse> searchUsers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {

        User condition = new User();
        condition.setName(name);
        condition.setEmail(email);

        List<User> users = userService.searchUsers(condition);

        List<UserResponse> responses = new ArrayList<>();

        for (User user : users) {
            UserResponse response = new UserResponse(
                    user.getId(),
                    user.getName(),
                    user.getEmail());
            responses.add(response);
        }

        return responses;
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping
    public UserResponse createUser(@Valid @RequestBody UserRequest request) {

        User user = new User(request.getName(), request.getEmail());

        User created = userService.createUser(user);

        return new UserResponse(
                created.getId(),
                created.getName(),
                created.getEmail());
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public UserResponse updateUser(
            @PathVariable Integer id,
            @Valid @RequestBody UserRequest request) {

        User user = new User(request.getName(), request.getEmail());

        User updated = userService.updateUser(id, user);

        return new UserResponse(
                updated.getId(),
                updated.getName(),
                updated.getEmail());
    }

}
