package transport.AirPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value
public class SmallAirPost implements SmallParcel {

    TransportEnum transport = TransportEnum.AIRPOST;

    @Override
    public int getSize() {
        return 2*3;
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
