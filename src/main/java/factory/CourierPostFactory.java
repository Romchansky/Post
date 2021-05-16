package factory;

import parcel.LargeParcel;
import parcel.MediumParcel;
import parcel.OverSizeParcel;
import parcel.SmallParcel;

class CourierPostFactory extends PostFactory {

    @Override
    public SmallParcel createSmallParcell() {
        return null;
    }

    @Override
    public MediumParcel createMediumParcell() {
        return null;
    }

    @Override
    public LargeParcel createLargeParcell() {
        return null;
    }

    @Override
    public OverSizeParcel createOverSizeParcell() {
        return null;
    }
}
