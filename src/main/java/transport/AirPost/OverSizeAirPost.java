package transport.AirPost;

import factory.TransportEnum;
import parcel.OverSizeParcel;

public class OverSizeAirPost implements OverSizeParcel {
    TransportEnum transport = TransportEnum.AIRPOST;
    @Override
    public int getSize() {
        return 25*25*25;
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public TransportEnum getTransport() {
        return transport;
    }
}
