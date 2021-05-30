package transport.TrainPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.LargeParcel;

@Value

public class LargeTrainPost implements LargeParcel {
    TransportEnum transport = TransportEnum.TRAINPOST;
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
