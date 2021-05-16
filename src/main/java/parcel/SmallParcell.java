package parcel;

public interface SmallParcell extends Parcell {
    @Override
    default ParcellEnum getParcell() {
        return ParcellEnum.SMALLPARCELL;
    }
}
