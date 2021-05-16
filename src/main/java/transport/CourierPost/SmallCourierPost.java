package transport.CourierPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value
public class SmallCourierPost implements SmallParcel {

    TransportEnum transport = TransportEnum.COURIER;

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
