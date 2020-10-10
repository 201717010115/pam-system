package com.fnode.pam.service.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import com.fnode.pam.common.core.domain.AjaxResult;

@RestController
@RequestMapping("api")
public class LoginConroller {



    @RequestMapping("/login")
    public AjaxResult login() {

        AjaxResult ajax = AjaxResult.success();

        return ajax;

    }
}
