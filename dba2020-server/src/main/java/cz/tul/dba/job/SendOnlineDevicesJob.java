package cz.tul.dba.job;

import cz.tul.dba.blogic.service.device.DeviceService;
import cz.tul.dba.dto.out.OnlineDeviceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendOnlineDevicesJob {

    @Autowired
    private SimpMessagingTemplate messageSender;

    @Autowired
    private DeviceService deviceService;

    public void sendOnlineDevices() {
        List<OnlineDeviceDTO> onlineDeviceDTOList = deviceService.getOnlineDevices();
        messageSender.convertAndSend( "/topics/online", onlineDeviceDTOList);
    }
}
