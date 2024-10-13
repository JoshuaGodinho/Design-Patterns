public class LightningToUSBCAdapter implements USB_C{

    private LightningCharger lightningCharger;
    public LightningToUSBCAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public void chargeWithUSBC(){
        lightningCharger.chargeWithLightning();
    }
}
