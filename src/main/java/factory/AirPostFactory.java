package factory;

import parcel.LargeParcell;
import parcel.MediumParcell;
import parcel.OverSizeParcell;
import parcel.SmallParcell;

 class AirPostFactory extends PostFactory {
    @Override
    public SmallParcell createSmallParcell() {
        return null;
    }

    @Override
    public MediumParcell createMediumParcell() {
        return null;
    }

    @Override
    public LargeParcell createLargeParcell() {
        return null;
    }

    @Override
    public OverSizeParcell createOverSizeParcell() {
        return null;
    }
}

