package factory;

import parcel.LargeParcel;
import parcel.MediumParcel;
import parcel.OverSizeParcel;
import parcel.SmallParcel;

public abstract class PostFactory {

    public static PostFactory of (TransportEnum selectedTransport) {
        return selectedTransport.getFactory();
    }

    public abstract SmallParcel createSmallParcel();

    public abstract MediumParcel createMediumParcel();

    public abstract LargeParcel createLargeParcel();

    public abstract OverSizeParcel createOverSizeParcel();
}
