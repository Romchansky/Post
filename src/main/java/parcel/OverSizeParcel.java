package parcel;

public interface OverSizeParcel extends Parcel {

    @Override
    default ParcelEnum getParcel() {
        return ParcelEnum.OVERSIZEPARCEL;
    }
}