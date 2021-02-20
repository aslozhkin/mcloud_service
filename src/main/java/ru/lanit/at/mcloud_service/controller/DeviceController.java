package ru.lanit.at.mcloud_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import ru.lanit.at.mcloud_service.entity.Device;

import java.util.List;

@Controller
@RequestMapping("/devices")
public class DeviceController {
    private final String SELENIUM_HUB_URL = "http://hub:4444/grid/admin/ListProxiesServlet";
    private final String DP_URL = "http://postgrest-testing.apps.ocp-stage.gu.local/mcloud_devices";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String getDevices() {
        ResponseEntity<List<Device>> responseEntity = restTemplate.exchange(DP_URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Device>>() {});
        return "";
    }
}
