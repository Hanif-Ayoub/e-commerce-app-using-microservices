package org.sdia.billingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RefreshScope
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;
    @Autowired
    private MyVaultConfig myVaultConfig;
    //@Value("${token.accessTokenTimeout}")
    //private long accessTokenTimeout;
    //@Value("${token.refreshTokenTimeout}")
    //private long refreshTokenTimeout;
    @GetMapping("/myConfig")
    public Map<String,Object> myConfig(){
        //return Map.of("accessTokenTimeout",accessTokenTimeout,"accessTokenTimeout",accessTokenTimeout);
        return Map.of("consulConfig",myConsulConfig, "vaultConfig",myVaultConfig);
    }
}