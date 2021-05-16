package parcel;

public interface LargeParcel extends Parcel {

    @Override
    default ParcelEnum getParcel() {
        return ParcelEnum.LARGEPARCEL;
    }
}
