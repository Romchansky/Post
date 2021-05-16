package transport.CourierPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcell;

@Value
public class SmallCourierPost implements SmallParcell {
    private TransportEnum transport = TransportEnum.COURIER;
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
