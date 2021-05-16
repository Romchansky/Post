package parcel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ParcellEnum {
    SMALLPARCELL("Small parcell!"),
    MEDIUMPARCELL("Medium parcell!"),
    LARGEPARCELL("Large parcell!"),
    OVERSIZEPARCELL("Oversize parcell!");

    @Getter
    private final String name;

    }

