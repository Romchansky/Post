package transport.AirPost;

import factory.TransportEnum;
import parcel.SmallParcell;

public class SmallAirPost implements SmallParcell {
    private TransportEnum race = TransportEnum.AIRPOST;

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
        return TransportEnum.AIRPOST;
    }

}
