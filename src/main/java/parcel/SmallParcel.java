package parcel;

public interface SmallParcel extends Parcel {
    @Override
    default ParcelEnum getParcel() {
        return ParcelEnum.SMALLPARCEL;
    }
}
