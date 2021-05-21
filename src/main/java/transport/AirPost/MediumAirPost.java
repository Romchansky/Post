package transport.AirPost;

import factory.TransportEnum;
import parcel.MediumParcel;

public class MediumAirPost implements MediumParcel {
    TransportEnum transport = TransportEnum.AIRPOST;
    @Override
    public int getSize() {
        return 15*15*15;
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public TransportEnum getTransport() {
        return transport;
    }
}
