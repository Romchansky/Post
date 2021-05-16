package parcel;

import factory.TransportEnum;

public interface Parcell {
    int getSize();
    int getWeight();

    ParcellEnum getParcell();
    TransportEnum getTransport();

    default String createParcell() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is")
                //.append(this.getClass().getSimpleName())
                .append(getTransport().getName()).append(" ").append(getParcell().getName())
                .append(" parcell is : ");
        sb.append("size =").append(getSize());
        sb.append(", weight =").append(getWeight());
        return sb.toString();
    }

}

