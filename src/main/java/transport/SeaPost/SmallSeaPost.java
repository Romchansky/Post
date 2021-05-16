package transport.SeaPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value
public class SmallSeaPost implements SmallParcel {

    TransportEnum transport = TransportEnum.SEAPOST;

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public TransportEnum getTransport() {
        return transport;
    }
}
