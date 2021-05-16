package transport.AutoPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value
public class SmallAutoPost implements SmallParcel {

    TransportEnum transport = TransportEnum.AUTOPOST;

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
