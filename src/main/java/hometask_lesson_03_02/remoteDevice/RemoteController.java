package hometask_lesson_03_02.remoteDevice;

public class RemoteController implements Device, Volume{

    private TVDevice tvDevice;


    public static void main(String[] args) {

        RemoteController controller = new RemoteController();

    }



    public TVDevice getTvDevice() {
        return tvDevice;
    }

    public void setTvDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void currentChannel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }
}
