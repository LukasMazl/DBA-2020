package cz.tul.dba.configs;

import cz.tul.dba.job.SendOnlineDevicesJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class JobConfiguration {

    @Autowired
    private SendOnlineDevicesJob sendOnlineDevicesJob;

    @Scheduled(fixedDelay = 10000)
    public void sendOnlineDevices() {
        sendOnlineDevicesJob.sendOnlineDevices();
    }
}
