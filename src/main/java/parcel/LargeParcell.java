package parcel;

public interface LargeParcell extends Parcell {

    @Override
    default ParcellEnum getParcell() {
        return ParcellEnum.LARGEPARCELL;
    }
}
