package student.nfcnetwork.common.messages;


import java.util.List;

import student.nfcnetwork.common.WroupDevice;

public class RegisteredDevicesMessageContent {

    private List<WroupDevice> devicesRegistered;

    public List<WroupDevice> getDevicesRegistered() {
        return devicesRegistered;
    }

    public void setDevicesRegistered(List<WroupDevice> devicesRegistered) {
        this.devicesRegistered = devicesRegistered;
    }

}
