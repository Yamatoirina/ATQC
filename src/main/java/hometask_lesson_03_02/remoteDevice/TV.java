package hometask_lesson_03_02.remoteDevice;

public class TV extends TVDevice {
    private int VolumeLevel;
    private int ChannelNumber;

    public int getVolumeLevel() {
        return VolumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        VolumeLevel = volumeLevel;
    }

    public int getChannelNumber() {
        return ChannelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        ChannelNumber = channelNumber;
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
