package parcel;

public interface MediumParcell extends Parcell {

    @Override
    default ParcellEnum getParcell() {
        return ParcellEnum.MEDIUMPARCELL;
    }
}
