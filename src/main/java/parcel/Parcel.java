package parcel;

import factory.TransportEnum;

public interface Parcel {

    int getSize();
    int getWeight();

    ParcelEnum getParcel();
    TransportEnum getTransport();

    default String createParcel() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is")
                //.append(this.getClass().getSimpleName())
                .append(getTransport().getName()).append(" ").append(getParcel().getName())
                .append(" parcel is : ");
        sb.append("size =").append(getSize());
        sb.append(", weight =").append(getWeight());
        return sb.toString();
    }

}

