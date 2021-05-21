package transport.AirPost;

import factory.TransportEnum;
import parcel.LargeParcel;

public class LargeAirPost implements LargeParcel {
    TransportEnum transport = TransportEnum.AIRPOST;
    @Override
    public int getSize() {
        return 20*20*20;
    }

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public TransportEnum getTransport() {
        return transport;
    }
}
