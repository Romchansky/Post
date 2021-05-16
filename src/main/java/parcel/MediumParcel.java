package parcel;

public interface MediumParcel extends Parcel {

    @Override
    default ParcelEnum getParcel() {
        return ParcelEnum.MEDIUMPARCEL;
    }
}
