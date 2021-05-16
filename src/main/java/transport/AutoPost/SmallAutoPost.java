package transport.AutoPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcell;

@Value
public class SmallAutoPost implements SmallParcell {
    private TransportEnum transport = TransportEnum.AUTOPOST;
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
