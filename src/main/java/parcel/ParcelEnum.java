package parcel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ParcelEnum {
    SMALLPARCEL("Small parcel!"),
    MEDIUMPARCEL("Medium parcel!"),
    LARGEPARCEL("Large parcel!"),
    OVERSIZEPARCEL("Oversize parcel!");

    @Getter
    private final String name;

    }

