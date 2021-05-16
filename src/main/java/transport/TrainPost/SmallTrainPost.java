package transport.TrainPost;

import factory.TransportEnum;
import lombok.Value;
import parcel.SmallParcel;

@Value

public class SmallTrainPost implements SmallParcel {

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
