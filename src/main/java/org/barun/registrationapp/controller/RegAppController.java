package org.barun.registrationapp.controller;

import org.barun.registrationapp.model.request.LoginRequestModel;
import org.barun.registrationapp.model.response.LoginResponseModel;
import org.barun.registrationapp.model.response.RegDataResponseModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// ENTRYPOINT FOR THE SERVER WILL BE THUS http://localhost:8080/regapp
@RestController
@RequestMapping("/regapp")
public class RegAppController {

    @GetMapping(path = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegDataResponseModel> getAccountDetails() {
        RegDataResponseModel regDataResponseModel = new RegDataResponseModel();
        regDataResponseModel.setReg_id(1);
        regDataResponseModel.setName("BARUN");
        regDataResponseModel.setAadhar_no(123456789);
        regDataResponseModel.setAddress("ASANSOL");
        regDataResponseModel.setEmail_id("barun@gmail.com");
        regDataResponseModel.setPassword("admin123");
        return ResponseEntity.ok(regDataResponseModel);
    }

    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginResponseModel> checkLoginDetails(@RequestBody LoginRequestModel loginRequestModel) {
        LoginResponseModel loginResponseModel = new LoginResponseModel();
        loginResponseModel.setEmail_id(loginRequestModel.getEmail_id());
        loginResponseModel.setLoginSuccess(true);
        return ResponseEntity.ok(loginResponseModel);
    }
}
