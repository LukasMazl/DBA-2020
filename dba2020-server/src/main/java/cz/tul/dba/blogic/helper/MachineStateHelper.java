package cz.tul.dba.blogic.helper;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.blogic.entity.MachineStateEntity;
import cz.tul.dba.blogic.repository.MachineStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MachineStateHelper {

    private MachineStateRepository machineStateRepository;

    @Autowired
    public MachineStateHelper(MachineStateRepository machineStateRepository) {
        this.machineStateRepository = machineStateRepository;
    }

    public boolean isDeviceOnline(int minute, DeviceEntity deviceEntity) {
        Date date = new Date(System.currentTimeMillis() - 60 * 1000 * minute);
        List<MachineStateEntity> machineStateList = machineStateRepository.findAllByCreatedAfterAndDeviceEntity(date, deviceEntity);
        return machineStateList.size() > 0;
    }
}
