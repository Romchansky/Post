package transport.AirPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value
public class SmallAirPost implements SmallParcel {

    TransportEnum transport = TransportEnum.AIRPOST;

    @Override
    public int getSize() {
        return 10*10*10;
    }

    @Override
    public int getWeight() {
        return 20;
    }

    @Override
    public TransportEnum getTransport() {
        return transport;
    }

}
