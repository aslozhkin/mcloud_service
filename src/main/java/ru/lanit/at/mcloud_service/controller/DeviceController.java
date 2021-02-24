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
    private final static String SELENIUM_HUB_URL = "http://192.168.0.108:4444/";
    private final static String LIST_PROXIES_SERVLET = "grid/admin/ListProxiesServlet";
    private final static String DP_URL = "http://postgrest-testing.apps.ocp-stage.gu.local/";
    private final static String MCLOUD_DEVICES_TABLE = "mcloud_devices";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public ResponseEntity<List<Device>> getDevices() {
        ResponseEntity<List<Device>> allDevicesResponse = restTemplate.exchange(DP_URL + MCLOUD_DEVICES_TABLE, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Device>>() {});
        ResponseEntity<List<Device>> availableDevicesResponse = restTemplate.exchange(SELENIUM_HUB_URL + LIST_PROXIES_SERVLET, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Device>>() {});

        return allDevicesResponse;
    }
}
