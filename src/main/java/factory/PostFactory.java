package factory;

import parcel.LargeParcell;
import parcel.MediumParcell;
import parcel.OverSizeParcell;
import parcel.SmallParcell;

public abstract class PostFactory {
    public static PostFactory of (TransportEnum selectedTransport) {
        return selectedTransport.getFactory();
    }

    public abstract SmallParcell createSmallParcell();

    public abstract MediumParcell createMediumParcell();

    public abstract LargeParcell createLargeParcell();

    public abstract OverSizeParcell createOverSizeParcell();
}
