package factory;

import parcel.LargeParcel;
import parcel.MediumParcel;
import parcel.OverSizeParcel;
import parcel.SmallParcel;

class AutoPostFactory extends PostFactory {

    @Override
    public SmallParcel createSmallParcel() {
        return null;
    }

    @Override
    public MediumParcel createMediumParcel() {
        return null;
    }

    @Override
    public LargeParcel createLargeParcel() {
        return null;
    }

    @Override
    public OverSizeParcel createOverSizeParcel() {
        return null;
    }
}
