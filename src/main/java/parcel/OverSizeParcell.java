package parcel;

public interface OverSizeParcell extends Parcell {

    @Override
    default ParcellEnum getParcell() {
        return ParcellEnum.OVERSIZEPARCELL;
    }
}